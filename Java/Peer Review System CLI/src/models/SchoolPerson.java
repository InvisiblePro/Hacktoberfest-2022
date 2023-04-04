package models;

import errors.ValueException;

public abstract class SchoolPerson {
    String pId;
    String password;
    String name;

    protected SchoolPerson(String cPId, String cPassword, String cName) {
        pId = cPId;
        password = cPassword;
        name = cName;
    }

    public void trySignIn(PeerReviewSystem currentSystem, String iPId, String iPassword) throws ValueException {
        if (pId.equals(iPId) && password.equals(iPassword)) {
            throw new ValueException("Id or Password is incorrect");
        }
        currentSystem.currentUser = this;
    }

    public void signOut(PeerReviewSystem currentSystem) {
        currentSystem.currentUser = null;
    }

}
