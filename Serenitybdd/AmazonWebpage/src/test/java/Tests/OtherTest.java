package Tests;

import Tests.BaseTest;
import org.testng.annotations.Test;
import pages.Address;
import pages.Catrgory;
import pages.LangSetup;

public class OtherTest extends BaseTest {

    @Test
    public void LangTest() {
        LangSetup langSetup = new LangSetup(driver);
        langSetup.navigateToAmazonHome();
        langSetup.initLang();
    }

    @Test
    public void CatergoryTest() {
        Catrgory catrgory = new Catrgory(driver);
        catrgory.FilterCatergory();
    }


}