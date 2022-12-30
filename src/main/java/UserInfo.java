import java.util.Arrays;

public class UserInfo {
    String[] userInfo;

    public String getUserInfobyIndex(int index) {
        return userInfo[index];
    }

    public String[] getUserInfo() {
        return userInfo;
    }

    public void splitString(String info) {
        userInfo = info.split(" ");
    }

    @Override
    public String toString() {
        return Arrays.toString(userInfo);
    }
}
