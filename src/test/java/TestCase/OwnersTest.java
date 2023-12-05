package TestCase;

import Base.BaseTest;
import TestData.OwnersTestData;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.OwnersPage;

public class OwnersTest extends BaseTest {
    @Epic("Owners")
    @Description("Verify Add_Owner_successfully")
    @Story("Add Owners Basic Validations")
    @Test
    public void TC_01_Add_Owner_Successfully() {
        OwnersPage.AddNewOwner(
                OwnersTestData.firstName,
                OwnersTestData.lastName,
                OwnersTestData.address,
                OwnersTestData.city,
                OwnersTestData.phoneNumber);
    }


    @Epic("Owners")
    @Description("Check_Owner_Info_After_Add_Owner_Successfully")
    @Story("Add Owners Basic Validations")
    @Test
    public void TC_02_Check_Owner_Info_After_Added_Owner_Successfully() {

        // AddNewOwner :
        OwnersPage.AddNewOwner(
                OwnersTestData.firstName,
                OwnersTestData.lastName,
                OwnersTestData.address,
                OwnersTestData.city,
                OwnersTestData.phoneNumber);


        //


        OwnersPage.Check_Owner_Info_After_Added(
                OwnersTestData.firstName,
                OwnersTestData.address ,
                OwnersTestData.city ,
                OwnersTestData.phoneNumber);

    }

}
