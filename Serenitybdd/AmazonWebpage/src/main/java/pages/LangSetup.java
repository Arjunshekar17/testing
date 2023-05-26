package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LangSetup extends BasePage {
    WebDriver driver;

    public LangSetup(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/div")
    //*[@id=\"icp-nav-flyout\"]/span/span[2]/div
    WebElement ClickLang;

    @FindBy(xpath = "//*[@id=\"icp-language-translation-hint\"]")
    WebElement ChangeLang;

    @FindBy(className = "a-button-input")
    WebElement SubmitButton;


    public void initLang() {
        ClickLang.click();
        ChangeLang.click();
        SubmitButton.click();
    }
}

