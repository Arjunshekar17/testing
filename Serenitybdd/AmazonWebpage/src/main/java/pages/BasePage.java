package pages;

import Utils.UtilProp;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static String url= "https://www.amazon.in/";
    public static String browser=null;
    public static WebDriver driver ;


    public BasePage(WebDriver driver){
        this.driver = driver;

    }
    public static void navigateToAmazonHome(){
        String PropfilePath = System.getProperty("C:\\Users\\arjunshekar_g\\Downloads\\AmazonWebpage\\AmazonWebpage\\src\\main\\resources\\GlobalData.properties");
        UtilProp.getProperties();
        driver.get(url);

    }
    public static void main(String[] args){




    }
}
