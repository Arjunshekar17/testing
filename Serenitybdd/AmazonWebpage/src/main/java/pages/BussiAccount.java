package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BussiAccount extends BasePage {
    public BussiAccount(WebDriver driver){
        super(driver);
        this.driver= driver;
       PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div/span[contains(text(),'sign in')]")
    WebElement GetSignin;
    @FindBy(id = "createAccountSubmit")
    WebElement SignUp;
    @FindBy(id = "ab-registration-link")
    WebElement BussiAccReg;
    @FindBy(className = "b-form-control")
    WebElement EnterRegEmail;
    @FindBy(id = "submitEmailButtonId")
    WebElement SubmitReg;
    @FindBy(id ="ap_customer_name")
    WebElement Name;
    @FindBy(id = "ap_password")
    WebElement Password;
    @FindBy(id ="ap_password_check" )
    WebElement ConfirmPassword;
    @FindBy(id = "continue")
    WebElement ClickSubmit;
    @FindBy(className = "a-icon a-icon-alert")
    WebElement Message;

    public void BussiAccountDetails(){
        GetSignin.click();
        SignUp.click();
        BussiAccReg.click();
        EnterRegEmail.sendKeys("arjunshekar@hcl.com");
        SubmitReg.click();
        Name.sendKeys("Arjun");
        Password.sendKeys("Hcl@2001");
        ConfirmPassword.sendKeys("Hcl@2001");
        ClickSubmit.click();
        Message.getText();
    }
}
