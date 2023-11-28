package pw1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PageTitle {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();	
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("firefox");
		lp.setHeadless(false);
		Browser browser = playwright.firefox().launch(lp);
		Page page = browser.newPage();
		page.navigate("https://playwright.dev/");
		String title = page.title();
		System.out.println("Page title is : "+ title);
		String url = page.url();
		System.out.println("url is : " + url);
		browser.close();
		playwright.close();
				
	
	}

}
