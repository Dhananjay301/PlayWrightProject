package selectors;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector {
	
	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		
//		Way-1 Using text method
		Locator privacyList=page.locator("text=Privacy Policy");
		int count=privacyList.count();
		System.out.println(count);
		
		List<String> privacy=privacyList.allTextContents();
		for(String priName:privacy) {
			System.out.println(priName);
		}
		
//	Way-2 Using has text method- It will fetch direct element
		Locator aboutUs=page.locator("h5:has-text('About Us')");
		int aboutUsCount=aboutUs.count();
		System.out.println(aboutUsCount);
//		aboutUs.click();
		String text=aboutUs.textContent();
		System.out.println("text= "+text);
		
	}

}


















