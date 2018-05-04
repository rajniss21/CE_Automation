package test.frontend.test;

import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.elements.TradingHistory;
import java.util.Calendar;
import java.util.Date;

public class TradingHistoryTest extends SetupAndTeardown{

    @Test
    public void tradingHistorySearchFilterWorks() throws InterruptedException{

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        TradingHistory tradingHistoryObj = new TradingHistory(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        frontendLandingPageObj.getPopupAdvertisement().click();
        Thread.sleep(2000);
        frontendLandingPageObj.getTradingHistory().click();
        tradingHistoryObj.setTradingHistoryStatusFilterDropdown("Success");
        Thread.sleep(2000);
        tradingHistoryObj.getTradingHistoryDatePickerFrom().click();
        tradingHistoryObj.getDatePickerFrom().click();




    }




    public class DateUtil
    {
        public  Date InBetweenDays(Date date, int days)
        {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, -7); //minus number would decrement the days
            return cal.getTime();
        }
    }


}
