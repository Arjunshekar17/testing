package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeal extends BasePage{
    public TodaysDeal(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    WebElement TodaysDeal;
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[9]/div/div/div/a[2]/div")
    WebElement DealOfTheDay;
    public void TodaysDeal(){
        TodaysDeal.click();
        DealOfTheDay.click();
    }
}
