package steps;

import actors.SwagLabActor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwagLoginPage;

public class SwagLabSteps {
    SwagLoginPage swagLoginPage=new SwagLoginPage();

    @Given("user is on swagLab page")
    public void user_is_on_swag_lab_page() {
        swagLoginPage.navigateToUrl();

    }
    @Given("swagLab logo should be displayed")
    public void swag_lab_logo_should_be_displayed() {
        swagLoginPage.logoDisaply();

    }
    @When("user enter {string} in username section")
    public void user_enter_in_username_section(String string) {
        System.out.println("=============XXXXXXXXXXXXXX=====================");
    }
    @When("user enter {string} in password section")
    public void user_enter_in_password_section(String string) {

    }
    @Then("user is on swag home page")
    public void user_is_on_swag_home_page() {

    }

}
