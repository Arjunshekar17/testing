package Tests;

import Tests.BaseTest;
import org.testng.annotations.Test;
import pages.TodaysDeal;

public class TodaysDealTest extends BaseTest {
    @Test
    public void Todaysdeal(){
        TodaysDeal todaysDeal = new TodaysDeal(driver);
        todaysDeal.navigateToAmazonHome();
        todaysDeal.TodaysDeal();
    }
}
