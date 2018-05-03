package test.frontend.test;



import org.testng.annotations.Test;
import parser.ExcelFileParser;
import test.frontend.data.DataForBuySellOrder;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.form.BuySellForm;
import java.io.IOException;


public class BuySellOrderPostTest extends SetupAndTeardown{
    @Test(dataProvider="BuyData",dataProviderClass=test.frontend.data.DataForBuySellOrder.class, priority=1)
    public void addBuyOrderTest(String Chatty, String Expiry) throws InterruptedException, IOException {
        /**
         * Please check the excel file before running the test.
         * This test reads multiple excel files data(i.e 40 iterations)
         * */

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        BuySellForm buySellFormObj = new BuySellForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getBuySellOrders().click();
        Thread.sleep(3000);
        checkForTheText(buySellFormObj.getBuySellOrderPageHeader(), "BUY/SELL");
        Thread.sleep(3000);
        buySellFormObj.setCostPerCHTDropdown("1");
        Thread.sleep(2000);
        buySellFormObj.getChattyAmount().sendKeys(Chatty);
        buySellFormObj.getExpiryTime().sendKeys(Expiry);
        Thread.sleep(1000);
        buySellFormObj.getBuySellOrderSubmitBtn().click();


    }
    @Test(dataProvider="SellData",dataProviderClass=test.frontend.data.DataForBuySellOrder.class, priority=2)
    public void addSellOrderTest(String Chatty, String Expiry) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        BuySellForm buySellFormObj = new BuySellForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        frontendLandingPageObj.getBuySellOrders().click();
        Thread.sleep(1000);
        buySellFormObj.getSellNavigation().click();
        Thread.sleep(1000);
        buySellFormObj.setCostPerCHTDropdown("5¥ (0.00007199193920655092 ETH");
        buySellFormObj.getChattyAmount().sendKeys(Chatty);
        buySellFormObj.getExpiryTime().sendKeys(Expiry);
        Thread.sleep(1000);
        buySellFormObj.getBuySellOrderSubmitBtn().click();



    }




}
