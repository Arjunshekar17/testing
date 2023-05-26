package Utils;

import pages.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilProp {
    public static void main(String[] args){
        getProperties();
        System.out.println("path setted");
    }
    public static void getProperties() {
        try {
            Properties prop = new Properties();
            String PropfilePath = System.getProperty("user.dir");
            FileInputStream input = new FileInputStream(PropfilePath + "/src/main/resources/GlobalData.properties");
            prop.load(input);
            String browser = prop.getProperty("Browser");
            String Url = prop.getProperty("Url");
            BasePage.url = Url;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
