package test.frontend.test;

import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.elements.TopPage;



public class BuySellOrderProcessTest extends SetupAndTeardown {

    @Test
    public void buySellOrderProcessTest() throws InterruptedException{
        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        TopPage topPageObj = new TopPage(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        frontendLandingPageObj.getPopupAdvertisement().click();
        Thread.sleep(1000);
        topPageObj.getChtBuyOrderList().click();
        Thread.sleep(2000);
        topPageObj.getProcessnowBtn().click();


    }
}
