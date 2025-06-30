package PlayWright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPlaywright {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch();
		Page page=browser.newPage();
		page.navigate("https://www.flipkart.com/");
		String title=page.title();
		System.out.println("Title= "+title);
		browser.close();
		playwright.close();
	}

}
