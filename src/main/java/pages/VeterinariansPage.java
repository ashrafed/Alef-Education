package pages;

import Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class VeterinariansPage extends BasePage {
    public VeterinariansPage(SHAFT.GUI.WebDriver driver) {super(driver);}

    //************* Element Locator : *********************
    private static By VeterinariansButtonLocator = By.xpath("//*[@title ='veterinarians']");

    //************* VeterinariansPage Functions : *********************

    private static By VeterinariansNameLocator(String VeterinariansName){
        return  By.xpath("//*[.='"+VeterinariansName+"']");      // Veterinarians Button Locator
    }

    public static void CheckVeterinariansName(String VeterinariansName){

        driver.element().click(VeterinariansButtonLocator);
        driver.element().isElementDisplayed(VeterinariansNameLocator(VeterinariansName));
    }

}

