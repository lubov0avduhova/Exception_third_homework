package Exceptions;

public class WrongUserInfoCodeException {

    public boolean countEnough(String[] userInfo) {
        if (userInfo.length < 6) {
            return true;
        }
        return false;
    }
}
