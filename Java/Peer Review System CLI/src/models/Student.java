package models;

import java.util.ArrayList;
import java.util.List;

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

    public static void displayMainMenu() {
        System.out.println("1. View All Works");
        System.out.println("2. View Undone Works");
        System.out.println("3. View Done Works");
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
