package Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Homepage homepage=new Homepage();


    @Given("user is on home page")
    public void userIsOnHomePage() {
        homepage.UserhomePage();
    }

    @When("user click on popup button")
    public void userClickOnPopupButton() {
       homepage.ClickOnPopUp();
    }

    @And("get pagetitle")
    public void getPagetitle() {
        homepage.GetTitle();
    }

    @Then("user should close page successfully")
    public void userShouldClosePageSuccessfully() {
        homepage.ClosePopUp();
    }
}
