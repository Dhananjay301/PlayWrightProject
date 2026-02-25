package pages;

import base.ControlActions;
import constants.FilePath;
import utility.Proputility;

public class SwagLoginPage extends ControlActions {
    Proputility proputility=new Proputility(FilePath.dataFilePath);
    public void navigateToUrl(){
        String url=proputility.getValue("SwagUrl");
        startBrowser();
        navigateToSwagUrl(url);
    }

}
