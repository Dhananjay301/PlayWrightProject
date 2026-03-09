package ZplaywrightPractice.Download;

import com.microsoft.playwright.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();

//		By using frame locator
        page.navigate("https://the-internet.herokuapp.com/download");

        Download download=page.waitForDownload(()->{
            page.locator("//div/a[text()='random_data.txt']").click();
        });
        System.out.println("Filename== "+download.suggestedFilename());
        String actulFilename=download.suggestedFilename();
        Thread.sleep(3000);



        Path path= Paths.get("download/"+actulFilename);
        Path absolutePath=path.toAbsolutePath();
        download.saveAs(absolutePath);

        page.close();
        browser.close();
        playwright.close();


    }
}
