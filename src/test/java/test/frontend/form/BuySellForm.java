package test.frontend.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuySellForm {

    public BuySellForm(WebDriver param_driver){
        PageFactory.initElements(param_driver, this);
    }

    @FindBy(xpath = ".//*[@id='app']/main/div/div/h3")
    WebElement buySellOrderPageHeader;

    @FindBy(xpath = ".//*[@id='myTab']/li[2]/a")
    WebElement sellNavigation;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/div/form/div/div[1]/select")
    WebElement costPerCHTDropdown;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/div/form/div/div[2]/input")
    WebElement chattyAmount;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/div/form/div/div[3]/input")
    WebElement expiryTime;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div/div/div/div/div/form/div/div[6]/button")
    WebElement buySellOrderSubmitBtn;

    public WebElement getBuySellOrderPageHeader() {
        return buySellOrderPageHeader;
    }

    public WebElement getSellNavigation() {
        return sellNavigation;
    }

   /* public void getCostPerCHT(String costPerCHTInput) {
        Select dropdown = new Select(costPerCHT);
        dropdown.selectByVisibleText(costPerCHTInput);
    }*/

    public void setCostPerCHTDropdown(String costPerCHTDropdownInput) {
        Select dropdown = new Select(costPerCHTDropdown);
        dropdown.selectByIndex(1);
    }

    /*public void setAddressSelectionDropdown(String addressSelectionDropdownInput){
        Select dropdown = new Select(addressSelectionDropdown);
        dropdown.selectByVisibleText(addressSelectionDropdownInput);*/

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
