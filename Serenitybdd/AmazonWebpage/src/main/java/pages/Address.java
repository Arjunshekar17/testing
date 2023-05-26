package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address extends LogIn {
    WebDriver driver;

    public Address(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "nav-line-1")
    WebElement Address;

    @FindBy(xpath = "//*[@id=\"GLUXZipUpdateInput\"]")
    WebElement SelectPincode;

    @FindBy(xpath = "//*[@id=\"GLUXZipUpdate\"]/span/input")
    WebElement ClickSubmit;

    public void SetupAddress() {
        Address.click();
        SelectPincode.sendKeys("614707");
        ClickSubmit.click();
    }
}

