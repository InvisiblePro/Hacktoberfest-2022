package app;

import java.util.Scanner;

import errors.ValueException;
import models.PeerReviewSystem;
import models.Student;

/**
 * App
 */
public class App {

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
                        Student user = (Student) schoolPeerReviewSystem.getCurrentUser();
                        Student.displayMainMenu();

                        do {
                            stuChoice = scanner.nextLine();
                            if (stuChoice.equals("1")) {
                                user.viewAllWorks();
                            }
                            if (stuChoice.equals("2")) {
                                user.viewUndoneWorks();
                            }
                            if (stuChoice.equals("3")) {
                                user.viewDoneWorks();
                            }

                        } while (!stuChoice.equals("-1"));

                    } else {

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