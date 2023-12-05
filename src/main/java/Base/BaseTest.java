package Base;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.OwnersPage;

public class BaseTest {
    public SHAFT.GUI.WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void BeforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        homePage = new HomePage(driver);
        homePage.navigateToHomePage();
    }
}
