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

    public void doHomework(String wId, String answerString) {
        try {
            Work work = Search.getWorkById(wId, works);
            work.answer(answerString);
        } catch (NotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Abort Do Homework process\n");
        }
    }
}
