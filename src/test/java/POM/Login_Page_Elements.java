package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Elements extends Base_POM {

    public Login_Page_Elements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//
//    @FindBy(css = "input[formcontrolname='username']")
//    private WebElement usernameInput;
//
//    @FindBy(css = "input[formcontrolname='password']")
//    private WebElement passwordInput;
//
//    @FindBy(css = "button[aria-label='LOGIN']")
//    private WebElement loginButton;
//
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;

//    public WebElement getUsernameInput() {
//        return usernameInput;
//    }
//
//    public WebElement getPasswordInput() {
//        return passwordInput;
//    }
//
//    public WebElement getLoginButton() {
//        return loginButton;
//    }
//
    public WebElement getAcceptCookiesButton() { return acceptCookiesButton; }

    public void loginFunction(String data1, String data2) {
        sleep();
        getAcceptCookiesButton().click();
//        getUsernameInput().sendKeys(data1);
//        getPasswordInput().sendKeys(data2);
//        getLoginButton().click();
    }
}
