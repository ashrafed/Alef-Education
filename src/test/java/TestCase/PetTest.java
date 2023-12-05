package TestCase;

import Base.BaseTest;
import TestData.OwnersTestData;
import TestData.PetsTestData;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.OwnersPage;
import pages.PetPage;

import static pages.PetPage.PetsAndVisitsTextLocator;

public class PetTest extends BaseTest {

    @Epic("Pets")
    @Description("Add_New_Pet_Successfully")
    @Story("Pets page Basic Validations")
    @Test
    public void Add_New_Pet_Successfully(){

        // Add new Owner :
        OwnersPage.AddNewOwner(
                OwnersTestData.firstName,
                OwnersTestData.lastName,
                OwnersTestData.address,
                OwnersTestData.city,
                OwnersTestData.phoneNumber);


        // Add new Pet :

        PetPage.Add_New_Pet(
                PetsTestData.petName,
                PetsTestData.birthDatePet,
                "cat");


        // Check_Owner_Info_After_Added :

        OwnersPage.Check_Owner_Info_After_Added(
                "OwnersTestData.firstName",
                OwnersTestData.address ,
                "abo dube" ,
                OwnersTestData.phoneNumber);


        driver.element().isElementDisplayed(PetsAndVisitsTextLocator);

    }

}
