package Tests;

import Tests.BaseTest;
import org.testng.annotations.Test;
import pages.Cart;
import pages.LogIn;
import pages.SignUp;


import static pages.BasePage.driver;

public class LoginTest extends BaseTest {

    @Test
    public void LoginAmazon() {

        LogIn logIn = new LogIn(driver);

        logIn.navigateToAmazonHome();
        logIn.SigninHome();
        logIn.EnterLoginDetails();
    }

    @Test
    public void SignUp() {
        SignUp signup = new SignUp(driver);
        signup.navigateToAmazonHome();
        signup.SigninHome();
        signup.EnterSignupDetails();
    }

    @Test
    public void Cart() {
        Cart cart = new Cart(driver);
        Cart.navigateToAmazonHome();
        cart.SelectCart();
        cart.EnterLoginDetails();
    }

//    @Test
//    public void CustomerserviceTest(){
//        CustomerService customerService = new CustomerService(driver);
//        customerService.navigateToAmazonHome();
//        customerService.CustServices();
//        customerService.EnterLoginDetails();
//    }

}

