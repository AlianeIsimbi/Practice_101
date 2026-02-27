package sort;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SortingTest {
    public static void main(String[] args){
        String websiteURL = "https://practicesoftwaretesting.com/";
        Page page = Playwright.create().chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        ).newPage();
        page.navigate(websiteURL);
        Locator sortOption = page.locator("//*[@id=\"filters\"]/form[1]/div/select");
        sortOption.selectOption("name,asc");
        Locator productName = page.locator("body > app-root > div.container > app-overview > div:nth-child(3) > div.col-md-9 > div.container > a:nth-child(1) > div.card-body > h5");
        assertThat(productName).containsText("Adjustable Wrench");
        page.close();








    }
}
