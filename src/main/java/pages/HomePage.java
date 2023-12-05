package pages;

import Base.BasePage;
import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;

public class HomePage  extends BasePage {
    public HomePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }


    //************* Element Locator : *********************
    public static By imageLocator = By.className("img-responsive");      // Image Locator


    //************* HomePage Functions :*********************
    public void navigateToHomePage() {
        driver.browser().navigateToURL(BaseURl);
    }


    public static ElementActions CaptureScreenshot(){    //  verify Image Is Displayed  and CaptureScreenshot
        return driver.element().captureScreenshot(imageLocator);
    }
}
