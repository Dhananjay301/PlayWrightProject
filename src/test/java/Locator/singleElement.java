package Locator;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class singleElement {
	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Single element
		
		Locator singleEl=page.locator("text=reserved");
		String text=singleEl.textContent();
		System.out.println(text);
		
//		Multiple elements
		
		Locator multiEl=page.locator("text=Login");
		List<String> allCon=multiEl.allTextContents();
		System.out.println("count= "+multiEl.count());
		for(String content:allCon) {
			System.out.println(content);
		}
		

	}

}

















