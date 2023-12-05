package TestCase;

import Base.BaseTest;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VeterinariansPage;

public class VeterinariansTest extends BaseTest {

    @Epic("Veterinarians")
    @Description("_Check_Veterinarians_Name_Is_Found")
    @Story("Veterinarians page Basic Validations")
    @Test
    public void TC_01_Check_Veterinarians_Name_Is_Found(){
        VeterinariansPage.CheckVeterinariansName("James Carter");
    }
}
