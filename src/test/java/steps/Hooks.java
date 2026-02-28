package steps;

import base.ControlActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void startBrowser(){
        System.out.println("=======Browser started");
        ControlActions.startBrowser();
    }
    @After
    public void tearDown() {
        System.out.println("================Browser closed========");
        ControlActions.closeBrowser();
    }
}

