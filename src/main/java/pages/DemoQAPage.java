package pages;

import base.DemoQAControlActions;
import constants.FilePath;
import org.junit.jupiter.api.Assertions;
import utility.Proputility;

public class DemoQAPage extends DemoQAControlActions {
    Proputility proputility;
    private static String logoLoc="//img[@src='/assets/Toolsqa-DZdwt2ul.jpg']";
    private static String moduleLoc="//h5[text()='%s']/ancestor::a";
    public void navigateToUrl(String key) {
        proputility=new Proputility(FilePath.appUrlPath);
        String url=proputility.getValue(key);
        navigate(url);

    }

    public void appLogo() {
        boolean logoVisible=logoValidate(logoLoc);
        System.out.println("Logo Visible= "+logoVisible);
        Assertions.assertTrue(logoVisible, "logo not visible");
    }

    public void clickOnModule(String moduleName) {
        String locator=String.format(moduleLoc,moduleName);
        clickOnElement(locator);
    }


}
