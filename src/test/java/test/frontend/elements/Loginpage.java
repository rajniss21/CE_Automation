package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    public Loginpage(WebDriver param_driver){
        PageFactory.initElements(param_driver, this);
    }
    @FindBy(xpath = ".//*[@id='app']/div/div/div[2]/div[2]/div/h3")
    WebElement headerOfLoginForm;

    @FindBy(xpath = ".//*[@id='app']/div/div/div[2]/div[2]/div/form/div[1]/div/input")
    WebElement emailInput;

    @FindBy(xpath = ".//*[@id='app']/div/div/div[2]/div[2]/div/form/div[2]/div/input")
    WebElement passwordInput;

    @FindBy(xpath = ".//*[@id='app']/div/div/div[2]/div[2]/div/form/div[3]/button")
    WebElement loginSubmitBtn;

    @FindBy(xpath = ".//*[@id='app']/div/div/div[2]/div[2]/div/form/div[4]/a")
    WebElement forgotPasswordLink;


    public WebElement getHeaderOfLoginForm() {
        return headerOfLoginForm;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginSubmitBtn() {
        return loginSubmitBtn;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

}
