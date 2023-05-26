package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catrgory extends BasePage{

    public Catrgory(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "searchDropdownBox")
    WebElement SearchBox;
    public void FilterCatergory(){
        SearchBox.click();
    }
}
