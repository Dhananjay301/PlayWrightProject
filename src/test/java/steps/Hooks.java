package steps;

import base.ControlActions;
import base.DemoQAControlActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void startBrowser(Scenario scenario){
        if(scenario.getName().contains("home page")){
            System.out.println("Starting browser for Home Page tests");
            DemoQAControlActions.startBrowser();
        } else if (scenario.getName().contains("swag lab")) {
            System.out.println("Starting browser for Swag lab tests");
            ControlActions.startBrowser();

        }
    }
    @After
    public void tearDown() {
        System.out.println("================Browser closed========");
        ControlActions.closeBrowser();
    }
}

