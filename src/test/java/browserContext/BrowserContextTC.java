package browserContext;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextTC {
	public static void main(String[] args) {
		//to open 2browsers
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext br1=browser.newContext();
		Page page1=br1.newPage();
		page1.navigate("https://www.flipkart.com/");
		String title1=page1.title();
		System.out.println(title1);
		
		BrowserContext br2=browser.newContext();
		Page page2=br2.newPage();
		page2.navigate("https://www.amazon.com/ref=nav_logo");
		String title2=page2.title();
		System.out.println(title2);
		 
		page1.close();
		br1.close();
		br2.close();
		page2.close();

	}

}
