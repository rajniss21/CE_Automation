package test.frontend.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.frontend.elements.LoginPage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SetupAndTeardown {

    public WebDriver myWebDriver;
    public String CORE_URL = "qacht-market.ekbana.info/login";
    public String ADMIN_EMAIL = "ekbanat@gmail.com";
    public String ADMIN_PASSWORD = "Tensorflow123@";
    public boolean hasLoggedIn = false;

    /**
    defining drivers, opening browser, maximize window and get URL.
     */
    @BeforeMethod
    public void setup(){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","WebDrivers/"+"chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        myWebDriver = new ChromeDriver(chromeOptions);
        myWebDriver.manage().window().maximize();
        myWebDriver.get("http://"+CORE_URL);
        hasLoggedIn = false;
}

    /**
     * quit the browser
     */
    @AfterMethod
    public void teardown(){
        myWebDriver.quit();
    }
    /**
     * first check for the forms heading
     * Login to the system, suply email and password
     */
    public void LoginToTheModule(){
        if (hasLoggedIn) return;
        LoginPage loginpageObj = new LoginPage(myWebDriver);
        checkForTheText(loginpageObj.getHeaderOfLoginForm(), "SIGN IN");
        loginpageObj.getEmailInput().sendKeys(ADMIN_EMAIL);
        loginpageObj.getPasswordInput().sendKeys(ADMIN_PASSWORD);
        loginpageObj.getLoginSubmitBtn().click();
        hasLoggedIn = true;

    }
    /**
     *  Assertion texts are supplied here
     *  Supply Elements get text to assert and the required text
     *  @param elementToAssert
     *  @param requiredText
     * */
    public void checkForTheText(WebElement elementToAssert, String requiredText){
        logPrint();
        logPrint("(ACTUAL)"+elementToAssert.getText());
        logPrint("(Expected)"+requiredText);
        Assert.assertTrue(elementToAssert.getText().toLowerCase().contains(requiredText.toLowerCase()));
    }
    public boolean checkforthetext(WebElement elementToAssert, String requiredText, String anotherRequiredText){
        logPrint();
        logPrint("(ACTUAL)"+elementToAssert.getText());
        logPrint("(Expected)"+requiredText+" or+ "+anotherRequiredText);

        if(elementToAssert.getText().toLowerCase().contains(requiredText.toLowerCase()) || elementToAssert.getText().toLowerCase().contains(anotherRequiredText)){
            return true;
        }
        else
            return false;
    }
   /* public void checkIfLoggedIn() {
        FrontendLandingPage frontendLandingPageObj = new FrontendLandingPage(myWebDriver);
        Assert.assertEquals(frontendLandingPageObj.getNameOfTheUserLoggedIn().getText(), "ekbanat@gmail.com");

    }*/


    /**
     * For printing logs and informations
     *  @param textToPrint
     * */
    public void logPrint(String textToPrint){
        System.out.println("[Notes/Info]: "+textToPrint);
    }

    /**
     * For new line print use logPrint() function.
     */
    public void logPrint(){
        System.out.println("\n");
    }


    public void readOrderValues() throws IOException {
        Properties propertiesObject = new Properties();
        FileReader readMyPresets= new FileReader("buySellOrderPostUrl");

        propertiesObject.load(readMyPresets);
        readMyPresets.close();

    }





}
