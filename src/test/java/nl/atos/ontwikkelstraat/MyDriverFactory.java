package nl.atos.ontwikkelstraat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nerom on 28-12-2015.
 */
public class MyDriverFactory {

    public static final String USERNAME = "vincentfree";
    public static final String ACCESS_KEY = "fbbc3f8c-c2e6-4a3a-95c9-e5b5c27d0854";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
    //public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@localhost:8080/wd/hub";
    public static DesiredCapabilities caps;
    private static WebDriver sharedDriver;

    static {
        //String tunnel = System.getenv("TRAVIS_JOB_NUMBER");
        caps = DesiredCapabilities.chrome();

        caps.setCapability("platform", "Win8");

        caps.setCapability("version", "43.0");

        //caps.setCapability("tunnel-identifier",tunnel);

    }

    public MyDriverFactory() throws MalformedURLException {
        try {
            if (System.getenv("TRAVIS").equals("true")) {
                sharedDriver = new RemoteWebDriver(new URL(URL), caps);
            }
        } catch (NullPointerException e) {
            sharedDriver = new FirefoxDriver();
        }

    }


    public static WebDriver getSharedDriver() {
        if(sharedDriver == null){
            try {
                new MyDriverFactory();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sharedDriver;
    }
}
