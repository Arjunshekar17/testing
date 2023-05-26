package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends LogIn{
    WebDriver driver;
    public SignUp(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
//driver.findElement(By.xpath("//div/span[contains(text(),'sign in')]")).click();
//
//		driver.findElement(By.id("ap_email")).sendKeys("arjunshekarvg@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		System.out.println(driver.findElement(By.className("a-list-item")).getText());
//
//		driver.findElement(By.id("createAccountSubmit")).click();
//		driver.findElement(By.id("ap_customer_name")).sendKeys("ARJUNSHEKAR");
//		driver.findElement(By.id("ap_phone_number")).sendKeys("9944835240");
//
//		driver.findElement(By.id("ap_password")).sendKeys("Arjun@7801");
//		driver.findElement(By.className("a-button-input")).click();
//
//		System.out.println(driver.findElement(By.className("a-alert-content")).getText());
//    @FindBy(xpath = "//div/span[contains(text(),'sign in')]")
//    WebElement SiginFirst;
    @FindBy(id ="createAccountSubmit")
    WebElement SignUp;
    @FindBy(id = "ap_customer_name")
    WebElement Name;
    @FindBy(id = "ap_phone_number")
    WebElement MobileNum;
    @FindBy(id ="ap_password" )
    WebElement Password;
    @FindBy(className = "a-button-input")
    WebElement ClickSubmit;


    public void EnterSignupDetails(){

        SignUp.click();
        Name.sendKeys("ARJUNSHEKAR");
        MobileNum.sendKeys("9944835240");
        Password.sendKeys("Arjun@7801");
        ClickSubmit.click();

    }
}
