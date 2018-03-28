package test.frontend.test;



import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;

public class BuyOrderPostTest extends SetupAndTeardown{
    @Test(dataProvider="BuyData",dataProviderClass=test.frontend.data.DataforBuySellOrder.class, priority=1)
    public void addBuyOrderTest(String Cost, String Chatty, String Expiry) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);








    }


}
