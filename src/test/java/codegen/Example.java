package codegen;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://academy.naveenautomationlabs.com/");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
      page.frameLocator("#microfe-popup-login").getByText("Sign up").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").fill("Karthik");
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").fill("karthikkristipati123@gmail.com");
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").fill("Karthik@nlabs8123");
      page.frameLocator("#microfe-popup-login").locator("#loginPopupCloseBtn svg").click();
    }
  }
}
