package TestCase;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import static pages.HomePage.imageLocator;

public class HomeTest extends BaseTest {

    @Epic("Home")
    @Description("Verify image on home page")
    @Story("Home Page Basic Validations")
    @Test
    public void TC_01_Verify_Image_is_Disabled_in_HomePage() {
        homePage.CaptureScreenshot();
        driver.element().assertThat(imageLocator).isDisabled();
    }
}
