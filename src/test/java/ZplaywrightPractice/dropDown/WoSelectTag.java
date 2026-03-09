package ZplaywrightPractice.dropDown;

import com.microsoft.playwright.*;

public class WoSelectTag {

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://semantic-ui.com/modules/dropdown.html");

       Locator searchDrop= page.locator("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[6]/div/input[2]");

        Thread.sleep(4000);

        searchDrop.fill("Alge");
       Thread.sleep(2000);
       page.keyboard().press("Enter");

        Thread.sleep(3000);

        page.close();
        browser.close();
        playwright.close();

    }

}
