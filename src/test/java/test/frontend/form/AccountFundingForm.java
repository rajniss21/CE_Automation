package test.frontend.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountFundingForm {

    public AccountFundingForm(WebDriver param_webdriver){
        PageFactory.initElements(param_webdriver, this);
    }

    /**
     * FOR DEPOSIT.............
     */
    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/form/div[1]/input")
    WebElement privateKey;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/form/div[2]/button")
    WebElement unlockBtn;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div[2]/div/form/div[1]/input")
    WebElement amountToDeposit;

    @FindBy(id = "cht")
    WebElement depositCHT;

    @FindBy(id = "eth")
    WebElement depositETH;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div[2]/div/form/div[3]/button")
    WebElement generateTransactionBtn;

    /**
     * FOR WITHDRAW...............
     */

    @FindBy(xpath =".//*[@id='app']/main/div/div/div/div[2]/form/div[1]/input")
    WebElement publicAddress;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[2]/form/div[2]/input")
    WebElement amountToWithdraw;

    @FindBy(id = "cht")
    WebElement currencyTypeCht;

    @FindBy(id = "eth")
    WebElement currencyTypeEth;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[2]/form/div[4]/button")
    WebElement withdrawBtn;

    public WebElement getPrivateKey() {
        return privateKey;
    }

    public WebElement getUnlockBtn() {
        return unlockBtn;
    }

    public WebElement getAmountToDeposit() {
        return amountToDeposit;
    }

    public WebElement getDepositCHT() {
        return depositCHT;
    }
    public WebElement getDepositETH() {
        return depositETH;
    }


    public WebElement getGenerateTransactionBtn() {
        return generateTransactionBtn;
    }

    public WebElement getPublicAddress() {
        return publicAddress;
    }

    public WebElement getAmountToWithdraw() {
        return amountToWithdraw;
    }

    public WebElement getCurrencyTypeCht() {
        return currencyTypeCht;
    }

    public WebElement getCurrencyTypeEth() {
        return currencyTypeEth;
    }

    public WebElement getWithdrawBtn() {
        return withdrawBtn;
    }
}
