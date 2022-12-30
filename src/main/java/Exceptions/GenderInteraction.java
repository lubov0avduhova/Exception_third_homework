package Exceptions;

public class GenderInteraction {
    char[] gender;

    public void checkMale(String genderUser) throws GenderException {
        gender = new char[]{'f', 'm'};

        char smt2 = genderUser.charAt(0);

        if (smt2 != gender[0] && smt2 != gender[1]) {
            throw new GenderException();
        }
    }
}


