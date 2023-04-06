package models;

public class Teacher extends SchoolPerson {

    protected Teacher(String cPId, String cPassword, String cName) {
        super(cPId, cPassword, cName);
    }

    ///////////////////////////////////////////////////////////////
    // UI

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
