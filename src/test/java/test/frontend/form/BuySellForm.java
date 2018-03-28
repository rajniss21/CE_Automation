package test.frontend.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuySellForm {

    public BuySellForm(WebDriver param_driver){
        PageFactory.initElements(param_driver, this);
    }

    @FindBy(xpath = ".//*[@id='app']/main/div/h3")
    WebElement buySellOrderPageHeader;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/form/div/div[1]/select")
    WebElement costPerCHT;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/form/div/div[2]/input")
    WebElement chattyAmount;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/form/div/div[3]/input")
    WebElement expiryTime;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/form/div/div[6]/button")
    WebElement buySellOrderSubmitBtn;

    public WebElement getBuySellOrderPageHeader() {
        return buySellOrderPageHeader;
    }

    public void setCostPerCHT(WebElement costPerCHT) {
        this.costPerCHT = costPerCHT;
    }

    public WebElement getChattyAmount() {
        return chattyAmount;
    }

    public WebElement getExpiryTime() {
        return expiryTime;
    }

    public WebElement getBuySellOrderSubmitBtn() {
        return buySellOrderSubmitBtn;
    }

}
