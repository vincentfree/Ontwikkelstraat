package nl.atos.ontwikkelstraat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
/**
 * Created by vagrant on 12/24/15.
 */
public class FormControllerSteps {
    private final WebDriver driver;

    public FormControllerSteps(SharedDriver driver) {
        this.driver = driver;
    }


    @Given ("^That the website is running and I navigated to it$")
    public void That_the_website_is_running_and_I_navigated_to_it() {
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When ("^I fill in my firstName with \"([^\"]*)\"$")
    public void I_fill_in_my_firstName_with(String firstname) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(firstname);
        assertEquals(firstname, driver.findElement(By.id("name")).getText());
        throw new PendingException();
    }
    @When ("^I fill in my firstName$")
    public void I_fill_in_my_firstName() throws Throwable {

    }

    @And ("^I fill in my lastName$")
    public void I_fill_in_my_lastName() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And ("^I fill in my StreetName$")
    public void I_fill_in_my_StreetName() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And ("^I fill in my HouseNumber$")
    public void I_fill_in_my_HouseNumber() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And ("^I fill in my Zipcode$")
    public void I_fill_in_my_Zipcode() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And ("^I hit the submit button$")
    public void I_hit_the_submit_button() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then ("^I should see my name and address data on the next page and it is also saved$")
    public void I_should_see_my_name_and_address_data_on_the_next_page_and_it_is_also_saved() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }


}
