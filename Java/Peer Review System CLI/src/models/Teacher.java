package models;

import errors.NotFoundException;

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
