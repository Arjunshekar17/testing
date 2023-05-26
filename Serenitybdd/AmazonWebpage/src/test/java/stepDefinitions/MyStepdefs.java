package stepDefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

public class MyStepdefs extends PageObject {
    WebDriver driver;
    String Url = "https://www.amazon.in/";


    @Given("Given user launched the chrome browser")
    public void iHaveOpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\arjunshekar_g\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }


    @Then("User is on Amazon base Page")
    public void iAmOnLoginPage() {
        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Given("User on the Amazon home page")
    public void iAmOnTheAmazonHomePageHttpsWwwAmazonIn() {
        System.out.println(driver.getCurrentUrl());
    }


        @When("User click signin button to login and entered details.")
        public void i_click_signin_button_to_login_and_entered_details() {
            LogIn logIn1 = new LogIn(driver);
            logIn1.navigateToAmazonHome();
            logIn1.SigninHome();
            logIn1.EnterLoginDetails();

        }

    @And("Get the Signin Status")
    public void gettheSigninStatus() {
        System.out.println("Login failed");
    }

    @When("Signin fails so register to signup")
    public void signinFailsSoRegisterToSignup() {
        SignUp signup = new SignUp(driver);
        SignUp.navigateToAmazonHome();
        signup.SigninHome();
        signup.EnterSignupDetails();

    }

    @And("Get the Signup Status")
    public void getTheSignupStatus() {
        System.out.println("Signup completed");
    }


    @And("Get the cart Status")
    public void getTheCartStatus() {
        System.out.println("cart added");
    }

    @When("User click cart button")
    public void iClickCartButton() {
        Cart cart = new Cart(driver);
        Cart.navigateToAmazonHome();
        cart.SelectCart();
        cart.EnterLoginDetails();
    }

    @When("User click Address bar and set my pincode")
    public void iClickAddressBarAndSetMyPincode() {
        Address address = new Address(driver);
        address.navigateToAmazonHome();
        address.SetupAddress();
    }

    @And("Get the Address Status")
    public void getTheAddressStatus() {
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).getText());

    }

    @And("Get the language Status")
    public void getTheLanguageStatus() {
        System.out.println("language changed to Hindi");
    }

    @When("User click language button")
    public void iClickLanguageButton() {
        LangSetup langSetup = new LangSetup(driver);
        langSetup.navigateToAmazonHome();
        langSetup.initLang();
    }

    @When("User click customer service button")
    public void iClickCustomerServiceButton() {
        CustomerService customerService = new CustomerService(driver);
        customerService.navigateToAmazonHome();
        customerService.CustServices();
        customerService.EnterLoginDetails();
    }

    @And("Get the Custo service Status")
    public void getTheCustoServiceStatus() {
        System.out.println("servies accessed");
    }

    @When("User click today's deal button")
    public void iClickTodaySDealButton() {
        TodaysDeal todaysDeal = new TodaysDeal(driver);
        todaysDeal.navigateToAmazonHome();
        todaysDeal.TodaysDeal();
    }

    @And("Get the deal of the day Status")
    public void getTheDealOfTheDayStatus() {
        System.out.println("choose a product in today's deal");

    }

    @And("Get the category Status")
    public void getTheCategoryStatus() {
        System.out.println("Category is set as \"All \"as default,now it will filter products only on appliances category");
    }

    @When("User click category dropdown box")
    public void iClickCategoryDropdownBox() throws InterruptedException, AWTException {
        Catrgory catrgory = new Catrgory(driver);
        catrgory.FilterCatergory();

        Robot robot = new Robot();
        Thread.sleep(2000);
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    @Then("close browser")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}



