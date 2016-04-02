package nl.atos.ontwikkelstraat;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.atos.ontwikkelstraat.pojo.FormData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FormControllerSteps {
    private final WebDriver webdriver;
    public FormData formData;

    public FormControllerSteps(SharedDriver webdriver) {
        this.webdriver = webdriver;
    }

    @Before
    public void setUp() {
        formData = new FormData("john", "banks", "frontstreet", 12, "9485KS");
    }

    @After
    public void tearDown() {
        formData = null;
    }

    @Given("^That the website is running and I navigated to it$")
    public void that_the_website_is_running_and_I_navigated_to_it() throws InterruptedException {
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        if (System.getenv("TRAVIS") == "true") {
            webdriver.get("localhost:4445");
        } else webdriver.get("http://localhost:8080/");

    }

    @When("^I fill in my firstName with \"([^\"]*)\"$")
    public void i_fill_in_my_firstName_with(String firstname) {
        formData.setName(firstname);
        webdriver.findElement(By.id("name")).sendKeys(firstname);
        assertEquals(firstname, webdriver.findElement(By.id("name")).getAttribute("value"));
        //System.out.println(webdriver.findElement(By.id("name")).getAttribute("value"));
    }


    @And("^I fill in my lastName$")
    public void i_fill_in_my_lastName() throws Throwable {
        formData.setSurname("Johnson");
        webdriver.findElement(By.id("surname")).sendKeys("Johnson");
        assertEquals("Johnson", webdriver.findElement(By.id("surname")).getAttribute("value"));
    }

    @And("^I fill in my StreetName$")
    public void i_fill_in_my_StreetName() throws Throwable {
        formData.setStreetName("hoofdstraat");
        webdriver.findElement(By.id("streetName")).sendKeys("hoofdstraat");
        assertEquals("hoofdstraat", webdriver.findElement(By.id("streetName")).getAttribute("value"));
    }

    @And("^I fill in my HouseNumber$")
    public void i_fill_in_my_HouseNumber() throws Throwable {
        formData.setHouseNumber(134);
        webdriver.findElement(By.id("houseNumber")).sendKeys("134");
        assertEquals("134", webdriver.findElement(By.id("houseNumber")).getAttribute("value"));
    }

    @And("^I fill in my Zipcode$")
    public void i_fill_in_my_Zipcode() throws Throwable {
        formData.setZipCode("9485SL");
        webdriver.findElement(By.id("zipCode")).sendKeys("9485SL");
        assertEquals("9485SL", webdriver.findElement(By.id("zipCode")).getAttribute("value"));
    }

    @And("^I hit the submit button$")
    public void i_hit_the_submit_button() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) webdriver;
        jse.executeScript("window.scrollBy(0,250)", "");
        webdriver.findElement(By.id("testSubmit")).click();
    }

    @Then("^I should see my name and address data on the next page and it is also saved$")
    public void i_should_see_my_name_and_address_data_on_the_next_page_and_it_is_also_saved() throws Throwable {
        assertEquals(formData.getName(), webdriver.findElement(By.id("name")).getAttribute("value"));
        assertEquals(formData.getSurname(), webdriver.findElement(By.id("surname")).getAttribute("value"));
        assertEquals(formData.getStreetName(), webdriver.findElement(By.id("streetName")).getAttribute("value"));
        assertEquals(formData.getHouseNumber().toString(), webdriver.findElement(By.id("houseNumber")).getAttribute("value"));
        assertEquals(formData.getZipCode(), webdriver.findElement(By.id("zipCode")).getAttribute("value"));
    }


    @And("^The browser should be closed$")
    public void theBrowserShouldBeClosed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //webdriver.close();
//        webdriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//        webdriver.close();
    }

    @And("^I fill in my lastName with \"([^\"]*)\"$")
    public void i_fill_in_my_lastName_with(String lastName) throws Throwable {
        formData.setSurname(lastName);
        webdriver.findElement(By.id("surname")).sendKeys(lastName);
        assertEquals(lastName, webdriver.findElement(By.id("surname")).getAttribute("value"));
    }

    @And("^I fill in my StreetName with \"([^\"]*)\"$")
    public void i_fill_in_my_StreetName_with(String streetName) throws Throwable {
        formData.setStreetName(streetName);
        webdriver.findElement(By.id("streetName")).sendKeys(streetName);
        assertEquals(streetName, webdriver.findElement(By.id("streetName")).getAttribute("value"));
    }

    @And("^I fill in my HouseNumber with \"([^\"]*)\"$")
    public void i_fill_in_my_HouseNumber_with(String houseNumber) throws Throwable {
        formData.setHouseNumber(Integer.parseInt(houseNumber));
        webdriver.findElement(By.id("houseNumber")).sendKeys(houseNumber);
        assertEquals(houseNumber, webdriver.findElement(By.id("houseNumber")).getAttribute("value"));
    }

    @And("^I fill in my Zipcode with \"([^\"]*)\"$")
    public void i_fill_in_my_Zipcode_with(String zipCode) throws Throwable {
        formData.setZipCode(zipCode);
        webdriver.findElement(By.id("zipCode")).sendKeys(zipCode);
        assertEquals(zipCode, webdriver.findElement(By.id("zipCode")).getAttribute("value"));
    }

    @And("^After checking the values I want to go back to the main page$")
    public void afterCheckingTheValuesIWantToGoBackToTheMainPage() {
        webdriver.findElement(By.id("submitButton")).click();
        assertEquals("" + formData.getName() + " " + formData.getSurname(), webdriver.findElement(By.xpath("/html/body/div/div/div/span[1]")).getText());
        assertEquals("" + formData.getStreetName() +
                " " + formData.getHouseNumber() +
                " " + formData.getZipCode(), webdriver.findElement(By.xpath("/html/body/div/div/div/span[2]")).getText());
        webdriver.findElement(By.xpath("/html/body/div/div/div/form/input")).click();
    }
}
