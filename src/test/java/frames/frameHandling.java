package frames;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class frameHandling {


	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		
//		By using frame locator
		page.navigate("https://www.londonfreelance.org/courses/frames/");
//		System.out.println("Before acid page= "+page.title());
		FrameLocator frameLoc=page.frameLocator("//frame[@name='content']");
		Locator acidLink=frameLoc.locator("text=Acid-free paper for the digital age");
		acidLink.click();
		
//		Validate data in that frame
		FrameLocator frameNew=page.frameLocator("//frame[@name='content']");
		Locator mikeText=frameNew.locator("text=© Mike Holderness");
		String mikeContent=mikeText.textContent();
		System.out.println("mikeContect= "+mikeContent);
		
		String acidTitle=page.title();
		System.out.println("acidTitle= "+acidTitle);
	}

}













