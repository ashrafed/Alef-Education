package pages;

import Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class PetPage extends BasePage {
    public PetPage(SHAFT.GUI.WebDriver driver) {super(driver);}

    //************* Element Locator : *********************
    static By AddPetLocator = By.xpath("//a[contains(text(),'Add')]");
    static By NamePetLocator = By.xpath("//input[@id='name']");
    static By birthDatePetLocator = By.id("birthDate");
    static By submitButtonPetLocator = By.xpath("//button[@type='submit']");


    static By dropDowntypePetLocator = By.xpath("//select[@id='type']");     // DropDown type Pet Locator .

    public static By PetsAndVisitsTextLocator = By.xpath("//h2[.='Pets and Visits']");


    //************* PetPage Functions  : *********************

    public static void Retrieve_Selected_Text(String Type){       // To select any item form DropDown List .
        driver.element().select(dropDowntypePetLocator, Type);
    }

    public static void Add_New_Pet(String PetName ,String birthDatePet  , String Type){
        driver.element().click(AddPetLocator);
        driver.element().type(NamePetLocator ,PetName );
        driver.element().type(birthDatePetLocator ,birthDatePet);
        Retrieve_Selected_Text(Type);

        driver.element().click(submitButtonPetLocator);
    }

}
