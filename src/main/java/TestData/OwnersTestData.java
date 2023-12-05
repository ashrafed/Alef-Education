package TestData;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import java.util.Locale;
public class OwnersTestData {
    static Faker faker = new Faker();
    static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
    static long currentTimeMillis = System.currentTimeMillis();
    public static String firstName = faker.name().firstName()+currentTimeMillis;
    public static String lastName = faker.name().lastName()+currentTimeMillis;
    public static String address = faker.address().streetName()+currentTimeMillis;
    public static String city = faker.address().city()+currentTimeMillis;
    public static String phoneNumber = fakeValuesService.regexify("(010)(0)[0-9]{7}");  //PhoneNumber Generator

}
