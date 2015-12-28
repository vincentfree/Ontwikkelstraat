package sause.webtest;

/**
 * Created by nerom on 24-12-2015.
 */

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;


public class SampleSauceTest {


    public static final String USERNAME = "vincentfree";

    public static final String ACCESS_KEY = "fbbc3f8c-c2e6-4a3a-95c9-e5b5c27d0854";

    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


    public static void main(String[] args) throws Exception {


        DesiredCapabilities caps = DesiredCapabilities.chrome();

        caps.setCapability("platform", "Win8");

        caps.setCapability("version", "43.0");

        caps.setCapability("tunnel-identifier","ENV['TRAVIS_JOB_NUMBER']");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


        /**

         * Goes to Sauce Lab's guinea-pig page and prints title

         */


        driver.get("https://saucelabs.com/test/guinea-pig");

        System.out.println("title of page is: " + driver.getTitle());


        driver.quit();

    }

}