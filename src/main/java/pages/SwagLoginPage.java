package pages;

import base.ControlActions;
//import  com.microsoft.playwright.assertions.PlaywrightAssertions;
import constants.FilePath;
import utility.Proputility;
import org.junit.jupiter.api.Assertions;

public class SwagLoginPage extends ControlActions {
    private static String logoLocator="//div[text()='Swag Labs']";


    Proputility proputility=new Proputility(FilePath.dataFilePath);

    public void navigateToUrl(){
        String url=proputility.getValue("SwagUrl");
        startBrowser();
        navigateToSwagUrl(url);
    }

    public void logoDisaply(){
        Assertions.assertTrue(isElementDisplayed(logoLocator),"Element is not visible");
    }

}
