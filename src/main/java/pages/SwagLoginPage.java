package pages;

import base.ControlActions;
//import  com.microsoft.playwright.assertions.PlaywrightAssertions;
import constants.FilePath;
import utility.Proputility;
import org.junit.jupiter.api.Assertions;
import constants.WaitTime;

public class SwagLoginPage extends ControlActions {
    private static String logoLocator="//div[text()='Swag Labs']";
    private static String usernameLoc="#user-name";
    private static String passwordLoc="#password";
    private static String logOnButtonLoc="#login-button";


    Proputility proputility=new Proputility(FilePath.dataFilePath);

    public void navigateToUrl(){
        String url=proputility.getValue("SwagUrl");
        navigateToSwagUrl(url);
    }

    public void logoDisaply(){
        Assertions.assertTrue(isElementDisplayed(logoLocator),"Element is not visible");
    }

    public void username(String username){
        ControlActions.enterUsername(username,usernameLoc);
    }
    public void waitForIt(){
        waitForIt(WaitTime.normalWait);
    }

    public void password(String password) {
        enterPassword(password,passwordLoc);
    }

    public void loginButton() {
        loginButton(logOnButtonLoc);
    }
}
