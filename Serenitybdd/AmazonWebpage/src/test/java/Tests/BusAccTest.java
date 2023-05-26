package Tests;

import Tests.BaseTest;
import org.testng.annotations.Test;
import pages.BussiAccount;



public class BusAccTest  extends BaseTest {
    @Test
    public void BusAcc(){
        BussiAccount bussiAccount = new BussiAccount(driver);
        bussiAccount.navigateToAmazonHome();
        bussiAccount.BussiAccountDetails();
    }
}
