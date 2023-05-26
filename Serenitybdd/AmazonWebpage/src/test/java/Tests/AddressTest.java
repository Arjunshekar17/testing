package Tests;

import org.testng.annotations.Test;
import pages.Address;



public class AddressTest extends BaseTest {
    @Test
    public void SetAddress() {
        Address address = new Address(driver);
        address.navigateToAmazonHome();
        address.SetupAddress();
    }
}
