package maximizeWindow;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaxWindow {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		double width=screenSize.getWidth();
		double height=screenSize.getHeight();
		BrowserContext br=browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width, (int)height));
		Page page=br.newPage();
		page.navigate("https://www.londonfreelance.org/courses/frames/");
		System.out.println(page.title());
		
	}

}















