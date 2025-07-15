package maximizeWindow;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Chrome_Edge_IncognitoMode {

	public static void main(String[] args) {

		Playwright playwright=Playwright.create();
//		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		//		To launch chrome browser
//		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));

		//		To launch edge browser
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")));
	
		Page page=browser.newPage();
		page.navigate("https://www.londonfreelance.org/courses/frames/");
		System.out.println(page.title());

		
//		incognito mode instead of launch use launchPersistentContext
//		BrowserContext brc=playwright.chromium().launchPersistentContext(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"), new BrowserType.LaunchPersistentContextOptions().setHeadless(false));
//		Page page=brc.newPage();
//		page.navigate("https://www.londonfreelance.org/courses/frames/");
//		System.out.println(page.title());
	
	}

}
