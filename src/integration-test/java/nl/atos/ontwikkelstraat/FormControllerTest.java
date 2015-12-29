package nl.atos.ontwikkelstraat;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/",
        plugin = {"html:target/cukes","json:target/cucumber/tests.cucumber"})
public class FormControllerTest {

}
