package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends LogIn {
    static WebDriver driver;
    public Cart(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "nav-cart")
    WebElement ClickCart;

    @FindBy(className = "a-size-base-plus")
    WebElement CartLogin;

    public void SelectCart(){
        ClickCart.click();
        CartLogin.click();
    }
    public static void navigateToAmazonHome(){
        driver.get("https://www.amazon.in/");
    }
}

