package steps;

import actors.SwagLabActor;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
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
        System.out.println("Logo validation");
        swagLoginPage.logoDisaply();

    }
    @When("user enter {string} in username section")
    public void user_enter_in_username_section(String username) {
        System.out.println("Enter the username");
        swagLoginPage.username(username);
    }
    @When("user enter {string} in password section")
    public void user_enter_in_password_section(String password) {
        swagLoginPage.password(password);

    }
//    @Then("user is on swag home page")
//    public void user_is_on_swag_home_page() {
//
//    }
    @When("user wait for loader to be disapear")
    public void user_wait_for_loader_to_be_disapear() {
        System.out.println("Load to be disapper");
        swagLoginPage.waitForIt();
    }


    @And("user click on login button")
    public void userClickOnLoginButton() {
        swagLoginPage.loginButton();
    }
}
