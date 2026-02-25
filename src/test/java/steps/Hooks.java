package steps;

import base.ControlActions;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {
        System.out.println("================After Hooks started========");
        ControlActions.closeBrowser();
    }
}

