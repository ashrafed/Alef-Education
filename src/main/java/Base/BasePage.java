package Base;

import com.shaft.driver.SHAFT;

public class BasePage {
    public static SHAFT.GUI.WebDriver driver;
    // Constractor .
    public BasePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public static final String BaseURl = System.getProperty("BaseURl");  // Base Url .

}
