package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog_Content_Elements extends Base_POM {

    public Dialog_Content_Elements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button[id = 'addNewRecordButton']")
    private WebElement addButton;

    @FindBy(css = "input[placeholder = 'First Name']")
    private WebElement firstName;

    @FindBy(css = "input[placeholder = 'Last Name']")
    private WebElement lastName;

    @FindBy(css = "input[placeholder = 'name@example.com']")
    private WebElement email;

    @FindBy(css = "input[placeholder = 'Age']")
    private WebElement age;

    @FindBy(css = "input[placeholder = 'Salary']")
    private WebElement salary;

    @FindBy(css = "input[placeholder = 'Department']")
    private WebElement department;

    @FindBy(css = "button[id = 'submit']")
    private WebElement submit;

    @FindBy(css = "input[placeholder = 'Type to search']")
    private WebElement search;

    @FindBy(xpath = "//div[contains(@class,'input-group-append')]")
  private WebElement searchButton;

    @FindBy(xpath = "//span[contains(@title,'Edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//span[contains(@title,'Delete')]")
    private WebElement deleteButton;



    @FindBy(xpath = "//div[contains(text(),'No rows found')]")
    private WebElement noDataMessage;


    public WebElement getAddButton() {return addButton;}

    public WebElement getFirstName() {return firstName;}

    public WebElement getLastName() {return lastName;}

    public WebElement getEmail() {return email;}

    public WebElement getAge() {return age;}

    public WebElement getSalary() {return salary;}

    public WebElement getDepartment() {return department;}

    public WebElement getSubmit() {return submit;}

    public WebElement getSearch() {return search;}

    public WebElement getSearchButton() {return searchButton;}

    public WebElement getEditButton() {return editButton;}

    public WebElement getDeleteButton() {return deleteButton;}


    public WebElement getNoDataMessage() {return noDataMessage;}
}
