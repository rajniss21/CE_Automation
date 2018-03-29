package test.frontend.test;



import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.form.BuySellForm;

public class BuyOrderPostTest extends SetupAndTeardown{
    @Test(dataProvider="BuyData",dataProviderClass=test.frontend.data.DataforBuySellOrder.class, priority=1)
    public void addBuyOrderTest(String Cost, String Chatty, String Expiry) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        BuySellForm buySellFormObj = new BuySellForm(myWebDriver);

        loginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getBuySellOrders().click();
        //Thread.sleep(1000);
        //checkForTheText(buySellFormObj.getBuySellOrderPageHeader(), "Buy/Sell");









    }


}
