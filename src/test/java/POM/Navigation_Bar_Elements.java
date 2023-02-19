package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation_Bar_Elements extends Base_POM {

    public Navigation_Bar_Elements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath= "(//div[@class = 'card-up'])[3]")
    private WebElement frames;

    @FindBy(xpath = "(//div[@class = 'header-wrapper'])[1]")
    private WebElement elements;

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTables;

    public WebElement getFrames() {
        return frames;
    }

    public WebElement getElements() {
        return elements;
    }

    public WebElement getWebTables() {
        return webTables;
    }
}
