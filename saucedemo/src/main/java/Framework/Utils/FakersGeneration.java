package Framework.Utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakersGeneration {

    private final Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;

    public FakersGeneration() {

        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName() {

        firstName = faker.name().firstName();
        return firstName;

        //return faker.name().firstName();

    }

    public String getLastName() {

        lastName = faker.name().lastName();
        return lastName;
    }

    public String getZipCode() {

        zipCode = faker.address().zipCode();
        return zipCode;

    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getPassword() {
        return faker.internet().password();
    }
    
    public String getValores() {
        return faker.random().nextInt(1, 1000).toString();
    }
}
