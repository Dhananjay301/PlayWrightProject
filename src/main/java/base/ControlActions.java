package base;

import com.microsoft.playwright.*;
import constants.FilePath;
import utility.Proputility;

import java.sql.Array;
import java.util.ArrayList;

public class ControlActions {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;


    public void startBrowser() {
        Proputility proputility=new Proputility(FilePath.dataFilePath);
        String browserName=proputility.getValue("browserName");
        boolean headlessFlag= Boolean.parseBoolean(proputility.getValue("headlessFlag"));

        playwright = Playwright.create();
        Browser browser = null;
        BrowserContext browserContext;
        switch(browserName.toLowerCase().trim()){
            case "firefox":
                browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(headlessFlag));
                break;

            case "edge":
                browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headlessFlag).setChannel("msedge"));
                break;

            case "chrome":
            default:
                ArrayList<String> arguments=new ArrayList<>();
                arguments.add("--start-maximized");
                browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headlessFlag).setChannel("chrome").setArgs(arguments));
                break;
        }
        browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page=browser.newPage();
    }

    public void navigateToSwagUrl(String url){
        page.navigate(url);
    }
}
