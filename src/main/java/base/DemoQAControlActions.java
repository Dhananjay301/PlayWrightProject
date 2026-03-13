package base;

import com.microsoft.playwright.*;
import constants.FilePath;
import utility.Proputility;

public class DemoQAControlActions {
    private static ThreadLocal<Playwright> threadLocalPlaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> threadLocalBrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> threadLocalBrowserContext = new ThreadLocal<>();
    private static ThreadLocal<Page> threadLocalPage = new ThreadLocal<>();
    static Proputility proputility;

    public static void startBrowser() {
         proputility = new Proputility(FilePath.dataFilePath);
        String browser = proputility.getValue("browserName");
        boolean flag= Boolean.parseBoolean(proputility.getValue("headlessFlag"));
        threadLocalPlaywright.set(Playwright.create());
        switch (browser.toLowerCase().trim()) {
            case "firefox":
                threadLocalBrowser.set(threadLocalPlaywright.get().firefox().launch(new BrowserType.LaunchOptions().setHeadless(flag)));
                break;

            case "chrome":
            default:
                threadLocalBrowser.set(threadLocalPlaywright.get().chromium().launch(new BrowserType.LaunchOptions().setHeadless(flag).setChannel(browser.toLowerCase().trim())));
        }
        threadLocalBrowserContext.set (threadLocalBrowser.get().newContext());
        threadLocalPage.set(threadLocalBrowserContext.get().newPage());
    }

    protected void navigate(String url) {
        threadLocalPage.get().navigate(url);

    }
    protected boolean logoValidate(String logoLoc){
        return threadLocalPage.get().locator(logoLoc).isVisible();
    }

    protected void clickOnElement(String locator) {
        threadLocalPage.get().locator(locator).click();
    }
}
