package steps;

import actors.loginActor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps {
    loginActor lA=new loginActor();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        lA.navigateToLogin();

    }
    @When("user enter username {string}")
    public void user_enter_username(String username) {
        lA.enterUserName(username);
    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
