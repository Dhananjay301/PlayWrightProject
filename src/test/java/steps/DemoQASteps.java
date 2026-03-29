package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoQAPage;
import pages.SwagLoginPage;

public class DemoQASteps {
    DemoQAPage qaPage = new DemoQAPage();

    @Given("User login in to {string} site")
    public void user_login_in_to_site(String key) {
        qaPage.navigateToUrl(key);
    }

    @Then("user should see application logo")
    public void user_should_see_application_logo() {
        qaPage.appLogo();
    }

    @Then("user should see forms feature")
    public void user_should_see_forms_feature() {

    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {

    }

    @When("user click on {string} module")
    public void user_click_on_module(String moduleName) {
        qaPage.clickOnModule(moduleName);
    }

    @When("user click on {string} button")
    public void user_click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks expand all button")
    public void user_clicks_expand_all_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks {string} all button")
    public void user_clicks_all_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects {string} checkbox")
    public void user_selects_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user validate {string} tree checkboxes")
    public void user_validate_tree_checkboxes(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
