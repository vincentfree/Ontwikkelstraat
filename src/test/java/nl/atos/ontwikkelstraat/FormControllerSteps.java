package nl.atos.ontwikkelstraat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class FormControllerSteps {
    private final WebDriver webdriver;

    public FormControllerSteps(SharedDriver webdriver) {
        this.webdriver = webdriver;
    }


    @Given ("^That the website is running and I navigated to it$")
    public void That_the_website_is_running_and_I_navigated_to_it() throws InterruptedException {
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        webdriver.get("http://localhost:8080/");

    }
    @When ("^I fill in my firstName with \"([^\"]*)\"$")
    public void I_fill_in_my_firstName_with(String firstname) throws Throwable {
        webdriver.findElement(By.id("name")).sendKeys(firstname);
        assertEquals(firstname, webdriver.findElement(By.id("name")).getText());
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
