package POM;

import base.ControlActions;
import constants.FilePath;
import utility.Proputility;

public class LoginPage {
    ControlActions controlActions = new ControlActions();
    Proputility proputility = new Proputility(FilePath.dataFilePath);
    String userNameLocator="input#username";

    public void navigateToUrl() {
        controlActions.startBrowser(proputility.getValue("testLogin"));

    }
    public void enterUserName(String username){
        controlActions.enterUname(userNameLocator,username);
    }
}
