package ZplaywrightPractice.dropDown;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class UsingSelect {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");

        //Single value select

        Locator countryLoc=page.locator("#country");
        Thread.sleep(2000);
        countryLoc.selectOption("United States");
        Thread.sleep(1000);

        countryLoc.selectOption("australia");
        Thread.sleep(2000);

        countryLoc.selectOption(new SelectOption().setValue("germany"));
        Thread.sleep(1000);

        countryLoc.selectOption(new SelectOption().setIndex(6));
        Thread.sleep(1000);

        countryLoc.selectOption(new SelectOption().setLabel("Germany"));
        Thread.sleep(1000);

//        Multiple value select

        Locator colour=page.locator("#colors");
        colour.selectOption(new String[]{"Red","Yellow"});
        Thread.sleep(4000);

        page.close();
        browser.close();
        playwright.close();
    }
}
