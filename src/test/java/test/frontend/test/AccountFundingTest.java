package test.frontend.test;

import org.testng.annotations.Test;
import test.frontend.elements.FrontendLandingPage;
import test.frontend.form.AccountFundingForm;

public class AccountFundingTest extends SetupAndTeardown{

    @Test(dataProvider="AccountFundingDeposit",dataProviderClass=test.frontend.data.DataForAccountFunding.class)
    public void accountFundingDepositTest(String privateKey, String amountToDeposit) throws InterruptedException{

        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        AccountFundingForm accountFundingFormObj = new AccountFundingForm(myWebDriver);

        LoginToTheModule();
        Thread.sleep(15000);
        checkForTheText(frontendLandingPageObj.getNameOfTheUserLoggedIn(), "ekbanat@gmail.com");
        Thread.sleep(1000);
        frontendLandingPageObj.getAccountFunding().click();
        accountFundingFormObj.getPrivateKey().sendKeys(privateKey);
        Thread.sleep(2000);
        accountFundingFormObj.getUnlockBtn().click();
        Thread.sleep(1000);
        accountFundingFormObj.getAmountToDeposit().sendKeys(amountToDeposit);
        Thread.sleep(2000);
        accountFundingFormObj.getDepositETH().click();
        accountFundingFormObj.getGenerateTransactionBtn().click();
    }

}
