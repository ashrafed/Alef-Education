package pages;

import Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class OwnersPage extends BasePage {
    public OwnersPage(SHAFT.GUI.WebDriver driver) {super(driver);}

    //************* Element Locator : *********************
    protected static By OwnersLocator = By.xpath("//*[@title ='find owners']");      // find owners Locator

    protected static By AddOwnersLocator = By.xpath("//*[.='Add Owner']");      // Add owners Locator
    protected static By firstNameOwnersLocator = By.id("firstName");      // first Name owners Locator
    protected static By lastNameOwnersLocator = By.id("lastName");      // last Name owners Locator
    protected static By addressOwnersLocator = By.id("address");      // address owners Locator
    protected static By cityOwnersLocator = By.id("city");      // city owners Locator
    protected static By telephoneOwnersLocator = By.id("telephone");      // telephone owners Locator
    protected static By submitButtonAddOwnersLocator = By.cssSelector("[type=\"submit\"]");      // submit Button owners Locator



    //************* Element Locator For Owner Info After Added : *********************

    static By NameLocator = By.xpath("//th[.='Name']");

    static By Name_Value(String Name_Value) {
        return   By.xpath("//b[.='"+Name_Value+"']");
    }

    By Address = By.xpath("//th[.='Address']");

    static By Address_Value(String Address_Value){
        return By.xpath("//td[.='"+Address_Value+"']");

    }

    By City	 = By.xpath("//th[.='City']");
    static By City_Value(String City_Value){
        return By.xpath("//td[.='"+City_Value+"']");
    }

    By Telephone	 = By.xpath("//th[.='Telephone']");
    static By Telephone_Value(String Telephone_Value) {
        return By.xpath("//td[.='"+Telephone_Value+"']");

    }




    //************* OwnersPage Functions : *********************

    public static void  AddNewOwner(String firstName ,String lastName , String address , String city , String telephone){

        driver.element().click(OwnersLocator);
        driver.element().click(AddOwnersLocator);

        driver.element().type(firstNameOwnersLocator , firstName);
        driver.element().type(lastNameOwnersLocator , lastName);
        driver.element().type(addressOwnersLocator , address);
        driver.element().type(cityOwnersLocator , city);
        driver.element().type(telephoneOwnersLocator, String.valueOf(telephone));

        driver.element().click(submitButtonAddOwnersLocator);

    }

    public static void Check_Owner_Info_After_Added(String Name , String Address , String City , String Telephone){


        driver.element().assertThat(NameLocator).text().contains(Name);
        driver.element().assertThat(Address_Value(Address.toString())).isDisabled();
        driver.element().assertThat(City_Value(City.toString())).text().contains(City);
        driver.element().assertThat(Telephone_Value(Telephone.toString())).isDisabled();

        System.out.println(driver.element().assertThat(NameLocator).text().contains("text"));

    }

}
