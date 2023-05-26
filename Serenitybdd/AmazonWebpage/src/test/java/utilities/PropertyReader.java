package utilities;

import Tests.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static void main(String[] args){
        getValue();
        System.out.println("path setted");
    }
    public static void getValue() {
        try {
            Properties prop = new Properties();
            String PropFilePath = System.getProperty("user.dir");
            FileInputStream input = new FileInputStream(PropFilePath + "./src/test/resources/GlobalData.properties");
            prop.load(input);
            String browser = prop.getProperty("Browser");
            String Url = prop.getProperty("Url");
            System.out.println(Url + " is opened in " + browser);
            BaseTest.browserName= browser;
            BaseTest.url= Url;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





