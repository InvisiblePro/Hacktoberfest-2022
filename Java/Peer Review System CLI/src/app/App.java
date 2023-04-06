package app;

import java.util.Scanner;

import errors.ValueException;
import models.PeerReviewSystem;
import models.Student;
import models.Teacher;

/**
 * App
 */
public class App {

    // TODO: #2 Refactor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeerReviewSystem schoolPeerReviewSystem = new PeerReviewSystem("Assimtion School");
        schoolPeerReviewSystem.initializeData();

        PeerReviewSystem.displayWelcome(schoolPeerReviewSystem.name);
        String choice;
        do {
            PeerReviewSystem.displayPreMenu();
            choice = scanner.nextLine();

            if (choice.equals("1") || choice.equals("2")) {
                System.out.print("Enter Id: ");
                String inputId = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                try {

                    if (choice.equals("1")) {
                        schoolPeerReviewSystem.trySignInAsStudent(inputId, password);
                    } else {
                        schoolPeerReviewSystem.trySignInAsTeacher(inputId, password);
                    }
                    PeerReviewSystem.displaySuccessfulProcess();

                    if (choice.equals("1")) {
                        String stuChoice;
                        Student student = (Student) schoolPeerReviewSystem.getCurrentUser();

                        do {
                            Student.displayMainMenu();
                            stuChoice = scanner.nextLine();
                            if (stuChoice.equals("1")) {
                                student.viewAllWorks();
                            }
                            if (stuChoice.equals("2")) {
                                student.viewUndoneWorks();
                            }
                            if (stuChoice.equals("3")) {
                                student.viewDoneWorks();
                            }
                            if (stuChoice.equals("4")) {
                                student.viewUndoneWorks();
                                System.out.print("Do Work Id: ");
                                String wId = scanner.nextLine();

                                System.out.print("Answer: ");
                                String answer = scanner.nextLine();
                                student.doWork(wId, answer);
                            }
                            if (stuChoice.equals("5")) {
                                schoolPeerReviewSystem.displayAllStudents();
                                System.out.print("Select student Id: ");
                                String sId = scanner.nextLine();
                                student.reviewOtherWorks(schoolPeerReviewSystem, scanner, sId);
                            }
                        } while (!stuChoice.equals("6"));

                    } else {
                        String teacherChoice;
                        Teacher teacher = (Teacher) schoolPeerReviewSystem.getCurrentUser();

                        do {
                            Teacher.displayMainMenu();
                            teacherChoice = scanner.nextLine();

                            if (teacherChoice.equals("1")) {
                                schoolPeerReviewSystem.displayAllStudents();
                                System.out.print("Select student Id: ");
                                String sId = scanner.nextLine();
                                System.out.print("Question: ");
                                String question = scanner.nextLine();
                                teacher.assignWorkToStudent(schoolPeerReviewSystem, sId, question);
                            }
                            if (teacherChoice.equals("2")) {

                            }

                        } while (!teacherChoice.equals(Teacher.SIGNOUT_NUMBER_STR));

                    }

                } catch (ValueException e) {
                    System.out.println(e.getLocalizedMessage());
                    System.out.println("---Abort Singing In Process---");
                }

            } else if (!choice.equals("3")) {
                PeerReviewSystem.displayInvalidOptionMessage();
            }

        } while (!choice.equals("3"));
        scanner.close();
    }
}