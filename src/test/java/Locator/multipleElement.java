package Locator;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class multipleElement {
	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		
		page.navigate("https://formstone.it/components/dropdown/demo/");
		Locator allCountry1=page.locator("select#demo_label option");
		System.out.println("allCountry count= "+allCountry1.count());
		
//		Way 1- using for loop
		for(int i=0; i<allCountry1.count();i++) {
			Locator country=allCountry1.nth(i);
			String countryName=country.textContent();
			System.out.println(countryName);
		}
		
		System.out.println("=====================================================");
//		way 2- using advance for loop
		List<String> allCountry2=allCountry1.allTextContents();
		String target="CaliforniA";
		for(String name:allCountry2) {
			if(name.equalsIgnoreCase(target)) {
				System.out.println(name);
			}
		}
		
	}

}



















