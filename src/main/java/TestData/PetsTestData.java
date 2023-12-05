package TestData;

import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;


public class PetsTestData {
    static Faker faker = new Faker();
    public static String petName = "Test Automation" + faker.animal().name();

    public static String birthDatePet =
            new SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date());    //Date Format 10-13-2022

}
