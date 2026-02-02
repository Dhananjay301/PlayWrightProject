package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("user login");
    }
    @When("user enter uname")
    public void user_enter_uname() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enter uname");
    }
    @Then("success")
    public void success() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Success");

    }

}
