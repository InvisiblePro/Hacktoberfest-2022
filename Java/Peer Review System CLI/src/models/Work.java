package models;

public class Work {

    static int countWork = 1;

    private String wId;
    private Teacher creator;
    private Student assignedStudent;
    private String question;
    private String answer;
    private boolean isAnswered;
    private Student reviewer;
    private boolean isReviewed;
    private boolean isCorrect;
    private boolean isPeerReviewValidatedByTeacher;

    public Work(Teacher cTeacher, Student aStudent, String questionString) {
        wId = String.valueOf(countWork);
        creator = cTeacher;
        assignedStudent = aStudent;
        question = questionString;
        answer = "";
        isAnswered = false;
        reviewer = null;
        isReviewed = false;
        isCorrect = false;
        isPeerReviewValidatedByTeacher = false;

        countWork++;
    }

    public String getwId() {
        return wId;
    }

    public Teacher getCreator() {
        return creator;
    }

    public Student getAssignedStudent() {
        return assignedStudent;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public Student getReviewer() {
        return reviewer;
    }

    public void setReviewer(Student student) {
        reviewer = student;
    }

    public void answer(String ans) {
        answer = ans;
        isAnswered = true;
    }

    public boolean isReviewed() {
        return isReviewed;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public boolean isPeerReviewValidatedByTeacher() {
        return isPeerReviewValidatedByTeacher;
    }

    public void setCorrect(boolean result) {
        isCorrect = result;
    }

    public void setPeerReviewValidatedByTeacher(boolean result, Teacher teacher) {
        if (!isReviewed) {
            System.out.println("Abort the Validate Process because this work is not reviewed by student yet.");
            return;
        }
        // Check Authority
        if (teacher == creator) {
            isPeerReviewValidatedByTeacher = result;
        }
    }

}
