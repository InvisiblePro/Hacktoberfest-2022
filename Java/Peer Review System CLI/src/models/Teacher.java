package models;

import java.util.Scanner;

import errors.NotFoundException;
import utils.Search;

public class Teacher extends SchoolPerson {

    protected Teacher(String cPId, String cPassword, String cName) {
        super(cPId, cPassword, cName);
    }

    ///////////////////////////////////////////////////////////////
    // Use Cases

    public void assignWorkToStudent(PeerReviewSystem system, String stuId, String question) {
        try {
            Student student = system.getStudentById(stuId);
            Work work = new Work(this, student, question);
            student.addWork(work);
            System.out.println("--Add Successfully--");
        } catch (NotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("---Abort Assign Work Process---");
        }

    }

    public void validateReviewedWork(PeerReviewSystem system, Scanner scanner, String sId) {
        try {
            Student student = system.getStudentById(sId);
            student.viewUnvalidatedWorks();
            System.out.println("Select Work Id: ");
            String wId = scanner.nextLine();
            Work work = Search.getWorkById(wId, student.getWorks());

            System.out.println(work.toString());

            System.out.println("Is Review Correct?");
            System.out.println("1. Correct");
            System.out.println("2. Incorrect");

            String choice;
            do {
                System.out.print("Choice: ");
                choice = scanner.nextLine();
                if (choice.equals("1")) {
                    work.setPeerReviewValidatedByTeacher(true, this);
                } else if (choice.equals("2")) {
                    work.setPeerReviewValidatedByTeacher(false, this);
                } else {
                    System.out.println("Invalid choice try again.");
                }

            } while (!choice.equals("1") && !choice.equals("2"));

        } catch (NotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("---Abort Validate Process---");
        }
    }

    ///////////////////////////////////////////////////////////////
    // UI

    public static void displayMainMenu() {
        System.out.println("1. Assign Work");
        System.out.println("2. Validate Peer Review");
        System.out.println("3. Sign Out");
    }

    public static final String SIGNOUT_NUMBER_STR = "3";

    @Override
    public String getName() {
        return "(Teacher): " + super.name;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Role: Teacher\n";
        return result;
    }

}
