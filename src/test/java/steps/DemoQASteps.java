package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DemoQAPage;
import pages.SwagLoginPage;

public class DemoQASteps {
    DemoQAPage qaPage=new DemoQAPage();

    @Given("User login in to {string} site")
    public void user_login_in_to_site(String url) {
        qaPage.navigateToUrl(url);
    }
    @Then("user should see application logo")
    public void user_should_see_application_logo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see forms feature")
    public void user_should_see_forms_feature() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
