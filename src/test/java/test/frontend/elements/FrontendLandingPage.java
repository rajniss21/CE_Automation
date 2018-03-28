package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontendLandingPage {

    public FrontendLandingPage(WebDriver param_webdriver){
        PageFactory.initElements(param_webdriver, this);
    }
    @FindBy(xpath = ".//*[@id='app']/header/ul/li/a")
    WebElement loggedUser;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[1]/a/span")
    WebElement topPage;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[2]/a/span")
    WebElement buySellOrders;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[3]/a/span")
    WebElement tradingHistory;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[4]/a/span")
    WebElement accountFunding;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[5]/a/span")
    WebElement configuration;

    @FindBy(xpath = ".//*[@id='app']/aside/ul/li[6]/a/span")
    WebElement frequentlyAskedQuestions;

    public WebElement getLoggedUser() {
        return loggedUser;
    }

    public WebElement getTopPage() {
        return topPage;
    }

    public WebElement getBuySellOrders() {
        return buySellOrders;
    }

    public WebElement getTradingHistory() {
        return tradingHistory;
    }

    public WebElement getAccountFunding() {
        return accountFunding;
    }

    public WebElement getConfiguration() {
        return configuration;
    }

    public WebElement getFrequentlyAskedQuestions() {
        return frequentlyAskedQuestions;
    }
}
