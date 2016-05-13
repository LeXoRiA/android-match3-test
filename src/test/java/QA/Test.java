package QA;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;

/**
 * Created by Eligra on 23.2.2016.
 */
public class Test extends Helpers
{
    private AndroidDriver driver;

    @Before
    public void setUp() throws Exception
    {
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), new DesiredCapabilities());
    }

    @org.junit.Test
    public void Test() throws Exception
    {
        log("Test script started");
        log("Launching application...");
        sleep(30); // Wait while application is launching
        log("Application is ready!");

        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("javaior.tmpdir", ""));

        /*Flasgship*/
        actionStations("BigTest", driver);

        /*Take screenshot to see last situation*/
        takeScreenshot("last", driver);
    }

    @After
    public void tearDown() throws Exception
    {
        log("Closing application");
        driver.quit();
        log("Application closed");
        log("Test done!");
    }
}
