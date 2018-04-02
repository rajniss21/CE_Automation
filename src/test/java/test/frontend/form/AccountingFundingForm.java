package test.frontend.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountingFundingForm {

    public AccountingFundingForm(WebDriver param_webdriver){
        PageFactory.initElements(param_webdriver, this);
    }

    /**
     * FOR DEPOSIT.............
     */
    @FindBy(xpath = ".//*[@id='app']/main/div/div/div[1]/form/div[1]/input")
    WebElement privateKey;

    /**
     * FOR WITHDRAW...............
     */

    @FindBy(xpath =".//*[@id='app']/main/div/div/div[2]/form/div[1]/input")
    WebElement publicAddress;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div[2]/form/div[2]/input")
    WebElement amount;

    @FindBy(id = "cht")
    WebElement currencyTypeCht;

    @FindBy(id = ".//*[@id='eth']")
    WebElement currencyTypeEth;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div[2]/form/div[4]/button")
    WebElement withdrawBtn;

    public WebElement getPrivateKey() {
        return privateKey;
    }

    public WebElement getPublicAddress() {
        return publicAddress;
    }

    public WebElement getAmount() {
        return amount;
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
