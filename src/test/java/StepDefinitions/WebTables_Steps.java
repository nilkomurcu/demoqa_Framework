package StepDefinitions;

import POM.Dialog_Content_Elements;
import POM.Navigation_Bar_Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Steps {
    Navigation_Bar_Elements nb = new Navigation_Bar_Elements();
    Dialog_Content_Elements dc = new Dialog_Content_Elements();

    @Test(priority = 1)
    @Given("User add Data {string} , {string} , {string} , {string} , {string} , {string}")
    public void userAddData(String firstName, String lastName, String email, String age, String salary, String department) {
        nb.sleep();
        nb.clickFunction(nb.getFrames());
        nb.clickFunction(nb.getElements());
        nb.clickFunction(nb.getWebTables());

        dc.clickFunction(dc.getAddButton());
        dc.sendKeysFunction(dc.getFirstName(), firstName);
        dc.sendKeysFunction(dc.getLastName(),lastName);
        dc.sendKeysFunction(dc.getEmail(),email);
        dc.sendKeysFunction(dc.getAge(),age);
        dc.sendKeysFunction(dc.getSalary(),salary);
        dc.sendKeysFunction(dc.getDepartment(),department);

        dc.clickFunction(dc.getSubmit());
        dc.waitUntilLoading();

    }

    @Test(priority = 2)
    @When("User add same Data {string} , {string} , {string} , {string} , {string} , {string}")
    public void userAddSameData(String firstName, String lastName, String email, String age, String salary, String department) {

        nb.sleep();
        nb.clickFunction(nb.getFrames());
        nb.clickFunction(nb.getElements());
        nb.clickFunction(nb.getWebTables());

        dc.clickFunction(dc.getAddButton());
        dc.sendKeysFunction(dc.getFirstName(), firstName);
        dc.sendKeysFunction(dc.getLastName(),lastName);
        dc.sendKeysFunction(dc.getEmail(),email);
        dc.sendKeysFunction(dc.getAge(),age);
        dc.sendKeysFunction(dc.getSalary(),salary);
        dc.sendKeysFunction(dc.getDepartment(),department);

        dc.clickFunction(dc.getSubmit());
        dc.waitUntilLoading();


    }


    @Test(priority = 3)
    @And("User edit Data {string} and change it to {string}")
    public void userEditDataAndChangeItTo(String firstName, String newFirst) {

        nb.sleep();
        nb.clickFunction(nb.getFrames());
        nb.clickFunction(nb.getElements());
        nb.clickFunction(nb.getWebTables());

        dc.sendKeysFunction(dc.getSearch(),firstName);
        dc.clickFunction(dc.getSearchButton());
        dc.waitUntilLoading();
        dc.clickFunction(dc.getEditButton());
        dc.clearFunction(dc.getFirstName());
        dc.sendKeysFunction(dc.getFirstName(),newFirst);
        dc.clickFunction(dc.getSubmit());
        dc.waitUntilLoading();

    }


    @Test(priority = 4)
    @Given("User delete Data {string}")
    public void userDeleteData(String newFirst) {
        nb.sleep();
        nb.clickFunction(nb.getFrames());
        nb.clickFunction(nb.getElements());
        nb.clickFunction(nb.getWebTables());

        dc.clickFunction(dc.getSearch());
        dc.sendKeysFunction(dc.getSearch(), newFirst);
        dc.clickFunction(dc.getSearchButton());
        dc.clickFunction(dc.getDeleteButton());

    }

    @Test(priority = 5)
    @When("User search deleted {string} in search input data")
    public void userSearchDeletedInSearchInputData(String newFirst) {
        nb.sleep();
        nb.clickFunction(nb.getFrames());
        nb.clickFunction(nb.getElements());
        nb.clickFunction(nb.getWebTables());

        dc.clickFunction(dc.getSearch());
        dc.sendKeysFunction(dc.getSearch(), newFirst);
        dc.clickFunction(dc.getSearchButton());
    }



    @Then("There is no data should displayed")
    public void thereIsNoDataShouldDisplayed() {
        dc.validationText(dc.getNoDataMessage(), "No rows found");
    }

}
