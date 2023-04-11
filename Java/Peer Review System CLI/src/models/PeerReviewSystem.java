package models;

import java.util.ArrayList;
import java.util.List;

import errors.NotFoundException;
import errors.ValueException;

public class PeerReviewSystem {

    public final String name;
    private SchoolPerson currentUser;
    private List<Student> students;
    private List<Teacher> teachers;

    public PeerReviewSystem(String systemName) {
        name = systemName;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public PeerReviewSystem(String systemName, List<Student> initStudents, List<Teacher> initTeachers) {
        name = systemName;
        students = initStudents;
        teachers = initTeachers;
    }

    public void initializeData() {
        students = new ArrayList<>();
        students.add(new Student("s01", "123456", "Sinut Wattanarporn"));
        students.add(new Student("s02", "123", "Alice Convey"));
        students.add(new Student("s03", "456", "Chen Chain"));

        teachers = new ArrayList<>();
        teachers.add(new Teacher("t01", "123456", "Songsri Jangnakarin"));
        teachers.add(new Teacher("t02", "qwert", "Jacob Karn"));
        teachers.add(new Teacher("t03", "asdfgh", "Smith Wingston"));
    }

    // #1 NEED REFACTOR:
    public void trySignInAsStudent(String pId, String pPassword) throws ValueException {
        int countInvalidAccount = 0;
        for (Student student : students) {
            try {
                student.trySignIn(this, pId, pPassword);
                System.out.println("--Logged In as a Student--");
                return;
            } catch (ValueException e) {
                countInvalidAccount++;
            }
        }
        if (countInvalidAccount == students.size()) {
            throw new ValueException("There's no valid student Account");
        }
    }

    // #1 NEED REFACTOR
    public void trySignInAsTeacher(String pId, String pPassword) throws ValueException {
        int countInvalidAccount = 0;
        for (Teacher teacher : teachers) {
            try {
                teacher.trySignIn(this, pId, pPassword);
                System.out.println("--Logged In as a Teacher--");
            } catch (Exception e) {
                countInvalidAccount++;
            }
        }
        if (countInvalidAccount == teachers.size()) {
            throw new ValueException("There's no valid Teacher Account");
        }
    }

    public SchoolPerson getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(SchoolPerson currentUser) {
        this.currentUser = currentUser;
    }

    public Student getStudentById(String sId) throws NotFoundException {
        for (Student student : students) {
            if (student.pId.equals(sId)) {
                return student;
            }
        }
        throw new NotFoundException("Can't find student with this id");
    }

    // ///////////////////////////////////////////////////////////////
    // UI

    public static void displayWelcome(String systemName) {
        System.out.println("Welcome to " + systemName + " System!");
        System.out.println("The objectives of this system are to provide student reviewing their homework each other");
        System.out.println("And the teacher will validate the review");
        System.out.println("--You can select the command by typing the number of that command eg. 1--");
        System.out.println("Enjoy Doing Homework, cheers!\n");
    }

    public static void displayInvalidOptionMessage() {
        System.out.println("----This is not an valid option----");
    }

    public static void displaySuccessfulProcess() {
        System.out.println("----The process is done successfully----");
    }

    public static void displayPreMenu() {
        System.out.println("1. Log In as a Student");
        System.out.println("2. Log In as a Teacher");
        System.out.println("3. Exit");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
