package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FrontendLandingPage {

    public WebDriver myWebDriver;

    public FrontendLandingPage(WebDriver param_webdriver) {
        PageFactory.initElements(param_webdriver, this);


    }


    @FindBy(xpath = ".//*[@id='app']/header/ul/li/a")
    WebElement nameOfTheUserLoggedIn;



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

    /**
     *  landing page header web elements..........
     */
    @FindBy(xpath = ".//*[@id='app']/header/div[1]/ul/li/div/label")
    WebElement darkThemeToggleBtn;

    @FindBy(xpath = ".//*[@id='app']/header/a[2]")
    WebElement sidebar;


    @FindBy(xpath = ".//*[@id='app']/header/ul/li/a/i")
    WebElement userIcon;

    @FindBy(xpath = ".//*[@id='app']/header/ul/li/ul/li[1]/a")
    WebElement userSettings;

    @FindBy(xpath = ".//*[@id='app']/header/ul/li/ul/li[2]/a")
    WebElement userProfile;

    @FindBy(xpath = ".//*[@id='app']/header/ul/li/ul/li[3]/a")
    WebElement userLogout;


    /**...................... END.........................*/


    public WebElement getNameOfTheUserLoggedIn() {
        return nameOfTheUserLoggedIn;
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

    /*public void getDarkThemeToggleBtn(){
        Actions forToggleAction = new Actions(myWebDriver);
        forToggleAction.moveToElement(darkThemeToggleBtn).perform();
        forToggleAction.click().build().perform();
    }*/

    public void setDarkThemeToggleBtn() {
        Actions forToggleAction = new Actions(myWebDriver);
        forToggleAction.moveToElement(darkThemeToggleBtn).perform();
        forToggleAction.click().build().perform();
    }

    public WebElement getSidebar() {
        return sidebar;
    }

    public WebElement getUserIcon() {
        return userIcon;
    }

    public WebElement getUserSettings() {
        return userSettings;
    }

    public WebElement getUserProfile() {
        return userProfile;
    }

    public WebElement getUserLogout() {
        return userLogout;
    }
}

