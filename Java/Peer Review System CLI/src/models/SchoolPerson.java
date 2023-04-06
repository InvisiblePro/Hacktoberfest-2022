package models;

import errors.ValueException;

public abstract class SchoolPerson {
    protected final String pId;
    private final String password;
    protected final String name;

    protected SchoolPerson(String cPId, String cPassword, String cName) {
        pId = cPId;
        password = cPassword;
        name = cName;
    }

    // ///////////////////////////////////////////////////////////////
    // Use Cases

    public void trySignIn(PeerReviewSystem currentSystem, String iPId, String iPassword) throws ValueException {
        if (pId.equals(iPId) && password.equals(iPassword)) {
            currentSystem.setCurrentUser(this);
            return;
        }
        throw new ValueException("Id or Password is incorrect");
    }

    public void signOut(PeerReviewSystem currentSystem) {
        currentSystem.setCurrentUser(null);
    }

    ///////////////////////////////////////////////////////////////
    // UI

    public abstract String getName();

    @Override
    public String toString() {
        String result = "";
        result += "PId: " + pId + "\n";
        result += "Name: " + name + "\n";
        return result;
    }
}
