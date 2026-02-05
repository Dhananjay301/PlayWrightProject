package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ControlActions {
    Playwright playwright;
    Browser browser;
    Page page;
    public void startBrowser(String url){
         playwright= Playwright.create();
        browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page=browser.newPage();
       page.navigate(url);

    }
    public void enterUname(String locator,String userName){
        page.locator(locator).fill(userName);
    }
}
