package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerService extends LogIn {
    public CustomerService(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[6]")
    WebElement CustoServices;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[5]/div/div[1]/div[1]/div[3]/a/div/div/div/div[2]/ul/li[1]/span")
    WebElement ManageSignin;

    public void CustServices(){
        CustoServices.click();
        ManageSignin.click();
    }
}
//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
//        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[2]")).click();

