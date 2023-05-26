package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends BasePage{
    WebDriver driver;

    public LogIn(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    By signInButton = By.xpath("//div/span[contains(text(),'sign in')]");

    //By enteremail = By.xpath("//*[@id=\"ap_email\"]");
    public void SigninHome() {
        driver.findElement(signInButton).click();
        //driver.findElement(enteremail).sendKeys("arjunshekarvg@gmail.com");
    }

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement mailid;

    @FindBy(id = "continue")
    WebElement SubmitSignin;

    @FindBy(className = "a-list-item")
    WebElement VerifySignin;


    public void EnterLoginDetails() {
        //Signin.click();
        mailid.sendKeys("arjunshekarvg@gmail.com");
        SubmitSignin.click();
        System.out.println(VerifySignin.getText());
    }


}
