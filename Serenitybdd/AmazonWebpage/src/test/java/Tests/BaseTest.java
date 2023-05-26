package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.PropertyReader;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public static String browserName=null;
    public static String url=null;



    @BeforeSuite
    public void setup() {
        String PropfilePath = System.getProperty("user.dir");
        PropertyReader.getValue();

        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\arjunshekar_g\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
        } else if (browserName.equalsIgnoreCase("edge") ){
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\arjunshekar_g\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        }
    }
//
//
//   @BeforeSuite
//    public void setup() {

//        String browserName = PropertyReader.getValue("browser");
//        String url = PropertyReader.getValue("Url");
//
//        if(browserName.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver",
//                    "C:\\Users\\arjunshekar_g\\Downloads\\chromedriver_win32\\chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.get(url);
//        } else if (browserName.equalsIgnoreCase("edge") ){
//            System.setProperty("webdriver.edge.driver",
//                    "C:\\Users\\arjunshekar_g\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//            WebDriver driver = new EdgeDriver();
//        }
//    }

//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\arjunshekar_g\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//        System.out.println(driver.getCurrentUrl());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//    }

    @AfterSuite
    public void Close() {
        driver.close();
   }
}
