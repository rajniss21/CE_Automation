package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TradingHistory {

    public TradingHistory(WebDriver param_driver){
        PageFactory.initElements(param_driver, this);
    }
    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div/div/div[1]/div/select")
    WebElement tradingHistoryStatusFilterDropdown;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div/div/div[2]/input")
    WebElement tradingHistoryDatePickerFrom;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div/div/div[3]/input")
    WebElement tradingHistoryDatePickerTo;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div/div[1]/div/div/span/button")
    WebElement tradingHistoryGoBtn;

    @FindBy(xpath = "html/body/div[4]/div[1]/table/tbody/tr[1]/td[2]")
    WebElement datePickerFrom;

    public void setTradingHistoryStatusFilterDropdown(String tradingHistoryStatusFilterDropdownInput){
        Select dropdown = new Select(tradingHistoryStatusFilterDropdown);
        dropdown.selectByVisibleText(tradingHistoryStatusFilterDropdownInput);

    }

    public WebElement getTradingHistoryDatePickerFrom() {
        return tradingHistoryDatePickerFrom;
    }

    public WebElement getTradingHistoryDatePickerTo() {
        return tradingHistoryDatePickerTo;
    }

    public WebElement getTradingHistoryGoBtn() {
        return tradingHistoryGoBtn;
    }

    public WebElement getDatePickerFrom() {
        return datePickerFrom ;
    }
}
