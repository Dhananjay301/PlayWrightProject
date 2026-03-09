package ZplaywrightPractice.checkBox;

import com.microsoft.playwright.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");

        Locator sunCheck=page.locator("#sunday");
        Locator monCheck=page.locator("#monday");

        System.out.println("Is checked before= "+sunCheck.isChecked());

        Thread.sleep(2000);
        if(!sunCheck.isChecked()){
            sunCheck.check();
        }else {
            sunCheck.uncheck();
        }
        System.out.println("Is checked After = "+sunCheck.isChecked());

        System.out.println("Is visible= "+monCheck.isVisible());
        System.out.println("Is checked = "+monCheck.isChecked());
        System.out.println("is disabled= "+monCheck.isDisabled());

        Thread.sleep(4000);

        page.close();
        browser.close();
        playwright.close();
    }
}
