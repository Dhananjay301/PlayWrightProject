package pages;

import base.DemoQAControlActions;
import org.junit.jupiter.api.Assertions;

public class DemoQAPage extends DemoQAControlActions {
    private static String logoLoc="//img[@src='/assets/Toolsqa-DZdwt2ul.jpg']";

    public void navigateToUrl(String url) {
        navigate(url);

    }

    public void appLogo() {
        boolean logoVisible=logoValidate(logoLoc);
        System.out.println("Logo Visible= "+logoVisible);
        Assertions.assertTrue(logoVisible, "logo not visible");
    }
}
