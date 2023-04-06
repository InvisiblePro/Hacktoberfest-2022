package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import errors.NotFoundException;
import utils.Search;

public class Student extends SchoolPerson {

    private List<Work> works;

    public Student(String cPId, String cPassword, String cName) {
        super(cPId, cPassword, cName);
        works = new ArrayList<>();
    }

    //////////////////////////////////////////////////////////////
    // Use Cases

    public void doWork(String wId, String answerString) {
        try {
            Work work = Search.getWorkById(wId, works);
            work.answer(answerString);
        } catch (NotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("---Abort Do Homework process---\n");
        }
    }

    public void reviewOtherWorks(PeerReviewSystem system, Scanner scanner, String sId) {
        try {
            Student other = system.getStudentById(sId);
            other.viewUnreviewedWorks();
            System.out.print("Review Work Id: ");
            String wId = scanner.nextLine();
            Work work = Search.getWorkById(wId, other.getWorks());

            System.out.println("Is Correct Answer?");
            System.out.println("1. Correct");
            System.out.println("2. Incorrect");

            String choice;
            do {
                System.out.print("Choice: ");
                choice = scanner.nextLine();
                if (choice.equals("1")) {
                    work.setCorrect(true);

                } else if (choice.equals("2")) {
                    work.setCorrect(false);
                } else {
                    System.out.println("Invalid choice try again.");
                }

            } while (!choice.equals("1") && !choice.equals("2"));

            work.setReviewer(this);
            work.getReviewed();

        } catch (NotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("---Abort Review Process---");
        }
    }

    public List<Work> getWorks() {
        return works;
    }

    public void addWork(Work work) {
        works.add(work);
    }

    ///////////////////////////////////////////////////////////////
    // UI

    public void viewAllWorks() {
        for (Work work : works) {
            System.out.println(work.toString());
        }
    }

    public void viewUndoneWorks() {
        for (Work work : works) {
            if (!work.isAnswered()) {
                System.out.println(work.toString());
            }
        }
    }

    public void viewDoneWorks() {
        for (Work work : works) {
            if (work.isAnswered()) {
                System.out.println(work.toString());
            }
        }
    }

    public void viewUnreviewedWorks() {
        for (Work work : works) {
            if (work.isAnswered() && !work.isReviewed()) {
                System.out.println(work.toString());
            }
        }
    }

    public void viewUnvalidatedWorks() {
        for (Work work : works) {
            if (work.isAnswered() && work.isReviewed() && !work.isPeerReviewValidatedByTeacher()) {
                System.out.println(work.toString());
            }
        }
    }

    public static void displayMainMenu() {
        System.out.println("1. View All Works");
        System.out.println("2. View Undone Works");
        System.out.println("3. View Done Works");
        System.out.println("4. Do Homework");
        System.out.println("5. Review Other Works");
        System.out.println("6. Sign Out");
    }

    @Override
    public String getName() {
        return "(Student): " + super.name;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Role: Student\n";
        return result;
    }

}
