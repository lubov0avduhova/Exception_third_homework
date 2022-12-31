import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ProcessingbyTXT {

    public void processingTXT(UserInfo userInfo) throws IOException {
        String name = userInfo.getUserInfobyIndex(0) + ".txt";
        try (OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(name), "windows-1251")) {
            for (int j = 0; j < userInfo.getUserInfo().length; j++) {
                fw.write(userInfo.getUserInfobyIndex(j) + " ");
            }

        }
    }
}




