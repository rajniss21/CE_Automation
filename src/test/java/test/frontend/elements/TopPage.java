package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopPage{

    public TopPage(WebDriver param_driver){
        PageFactory.initElements(param_driver, this);
    }
    @FindBy(xpath = ".//*[@id='app']/main/div/div/div[3]/div[1]/div/div[3]/table/tbody/tr[2]/td[4]")
    WebElement chtBuyOrderList;

    @FindBy(xpath = ".//*[@id='app']/main/div/div/div[4]/div/div/div[3]/button[2]")
    WebElement processnowBtn;

    public WebElement getChtBuyOrderList() {
        return chtBuyOrderList;
    }

    public WebElement getProcessnowBtn() {
        return processnowBtn;
    }
}
