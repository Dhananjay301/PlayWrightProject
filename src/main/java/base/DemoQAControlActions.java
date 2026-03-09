package base;

import com.microsoft.playwright.*;

public class DemoQAControlActions {
    private static ThreadLocal<Playwright> threadLocalPlaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> threadLocalBrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> threadLocalBrowserContext = new ThreadLocal<>();
    private static ThreadLocal<Page> threadLocalPage = new ThreadLocal<>();

    public static void startBrowser() {
        threadLocalPlaywright.set(Playwright.create());
        String browser = "chrome";

        switch (browser.toLowerCase().trim()) {

            case "chrome":
            default:
                threadLocalBrowser.set(threadLocalPlaywright.get().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")));
        }
        threadLocalBrowserContext.set (threadLocalBrowser.get().newContext());
        threadLocalPage.set(threadLocalBrowserContext.get().newPage());
    }

    protected void navigate(String url) {
        threadLocalPage.get().navigate(url);

    }

}
