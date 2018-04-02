package test.frontend.test;



import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.form.BuySellForm;



public class BuySellOrderPostTest extends SetupAndTeardown{
    @Test(dataProvider="BuyData",dataProviderClass=test.frontend.data.DataForBuySellOrder.class, priority=1)
    public void addBuyOrderTest(String Cost, String Chatty, String Expiry) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        BuySellForm buySellFormObj = new BuySellForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getBuySellOrders().click();
        Thread.sleep(1000);
        checkForTheText(buySellFormObj.getBuySellOrderPageHeader(), "BUY/SELL");
        Thread.sleep(1000);
        buySellFormObj.getCostPerCHT(Cost);
        buySellFormObj.getChattyAmount().sendKeys(Chatty);
        buySellFormObj.getExpiryTime().sendKeys(Expiry);
        Thread.sleep(1000);
        buySellFormObj.getBuySellOrderSubmitBtn().click();

    }
    @Test(dataProvider="SellData",dataProviderClass=test.frontend.data.DataForBuySellOrder.class, priority=2)
    public void addSellOrderTest(String Cost, String Chatty, String Expiry) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        BuySellForm buySellFormObj = new BuySellForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        frontendLandingPageObj.getBuySellOrders().click();
        Thread.sleep(1000);
        buySellFormObj.getSellNavigation().click();
        Thread.sleep(1000);
        buySellFormObj.getCostPerCHT(Cost);
        buySellFormObj.getChattyAmount().sendKeys(Chatty);
        buySellFormObj.getExpiryTime().sendKeys(Expiry);
        Thread.sleep(1000);
        buySellFormObj.getBuySellOrderSubmitBtn().click();



    }




}
