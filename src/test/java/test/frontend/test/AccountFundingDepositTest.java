package test.frontend.test;

import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.form.AccountFundingForm;

import javax.annotation.Nullable;

public class AccountFundingDepositTest extends SetupAndTeardown{

    @Test(dataProvider="AccountFundingDeposit",dataProviderClass=test.frontend.data.DataForAccountFunding.class)
    public void accountFundingDepositTest(String privateKey, String amountToDeposit) throws InterruptedException{

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        AccountFundingForm accountFundingFormObj = new AccountFundingForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getPopupAdvertisement().click();
        Thread.sleep(1000);
        frontendLandingPageObj.getAccountFunding().click();
        Thread.sleep(2000);
        accountFundingFormObj.getPrivateKey().sendKeys(privateKey);
        Thread.sleep(2000);
        accountFundingFormObj.getUnlockBtn().click();
        Thread.sleep(1000);
        accountFundingFormObj.getAmountToDeposit().sendKeys(amountToDeposit);
        Thread.sleep(2000);
        accountFundingFormObj.getDepositETH().click();
        accountFundingFormObj.getGenerateTransactionBtn().click();
    }
    @Test(dataProvider = "AccountFundingWithdraw", dataProviderClass = test.frontend.data.DataForAccountFunding.class)
    public void accountFundingWithdrawTest(String publicAddress, String amountToWithdraw) throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        AccountFundingForm accountFundingFormObj = new AccountFundingForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getPopupAdvertisement().click();
        Thread.sleep(1000);
        frontendLandingPageObj.getAccountFunding().click();
        accountFundingFormObj.getPublicAddress().sendKeys(publicAddress);
        Thread.sleep(2000);
        accountFundingFormObj.getAmountToWithdraw().sendKeys(amountToWithdraw);
        Thread.sleep(1000);
        accountFundingFormObj.getCurrencyTypeEth().click();
        accountFundingFormObj.getWithdrawBtn().click();
    }
    @Test
    public void testThatDarkThemeToggleWorks() throws InterruptedException {

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);


        LoginToTheModule();
        Thread.sleep(10000);
        frontendLandingPageObj.setDarkThemeToggleBtn();
        Thread.sleep(2000);

    }


}
