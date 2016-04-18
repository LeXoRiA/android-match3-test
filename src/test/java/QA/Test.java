package QA;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

//import org.apache.xpath.operations.String;

/**
 * Created by qa1 on 23.2.2016.
 */
public class Test extends Helpers
{
    private AndroidDriver driver;

    public static class CKTest extends Helpers
    {
        public CKTest() throws Exception
        {
            super();
            screenshotsFolder = "ck";
        }
        private  String sessionId;
    }

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
        sleep(30);
        log("Application is ready!");

        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("javaior.tmpdir", ""));

//        actionStations("firstTest", driver);


        actionStations("BigTest", driver);


//        public void allinOne (
// final String name,
// String imageUrl,
// String destinationFile,
// String template,
// String image,
// String imageGray,
// String imageCanny,
// String resizedCanny,
// String resultCanny,
// String matchCase,
// String outFile,
// AndroidDriver _driver2,
// int second)


//        /* First match */
//        allinOne("firstlevel",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/firstcloud_m.png",
//                screenshotDirectory + "/firstcloud.png",
//                "/firstcloud.png",
//                "/firstlevel.png",
//                "/firstlevelGray.png",
//                "/firstlevelCanny.png",
//                "/firstlevelResized.png",
//                "/firstlevelResult.png",
//                "down",
//                "/matched1.png",
//                driver,
//                5);
//
//        /* First okay */
//        allinOne("firstlevel_okay",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/okay_m.png",
//                screenshotDirectory + "/okay.png",
//                "/okay.png",
//                "/firstlevel_okay.png",
//                "/firstlevel_okayGray.png",
//                "/firstlevel_okayCanny.png",
//                "/firstlevel_okayResized.png",
//                "/firstlevel_okayResult.png",
//                "tap",
//                "/matched2.png",
//                driver,
//                5);
//
//        /* Second match */
//        allinOne("firstlevel2",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/secondcloud_m.png",
//                screenshotDirectory + "/secondcloud.png",
//                "/secondcloud.png",
//                "/firstlevel2.png",
//                "/firstlevel2Gray.png",
//                "/firstlevel2Canny.png",
//                "/firstlevel2Resized.png",
//                "/firstlevel2Result.png",
//                "right",
//                "/matched3.png",
//                driver,
//                5);
//
//        /* Second okay */
//        allinOne("firstlevel_okay2",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/okay_m.png",
//                screenshotDirectory + "/okay.png",
//                "/okay.png",
//                "/firstlevel_okay.png",
//                "/firstlevel_okayGray.png",
//                "/firstlevel_okayCanny.png",
//                "/firstlevel_okayResized.png",
//                "/firstlevel_okayResult.png",
//                "tap",
//                "/matched4.png",
//                driver,
//                5);
//
//        /* Third match*/
//        allinOne("firstlevel3",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/thirdcloud_m.png",
//                screenshotDirectory + "/thirdcloud.png",
//                "/thirdcloud.png",
//                "/firstlevel3.png",
//                "/firstlevel3Gray.png",
//                "/firstlevel3Canny.png",
//                "/firstlevel3Resized.png",
//                "/firstlevel3Result.png",
//                "down",
//                "/matched5.png",
//                driver,
//                5);
//        sleep(5);
//
//        /*Success dialogue*/
//        allinOne("firstlevel4",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/go_m.png",
//                screenshotDirectory + "/go.png",
//                "/go.png",
//                "/firstlevel4.png",
//                "/firstlevel4Gray.png",
//                "/firstlevel4Canny.png",
//                "/firstlevel4Resized.png",
//                "/firstlevel4Result.png",
//                "tap",
//                "/matched6.png",
//                driver,
//                5);
//        sleep(5);
//
//        /* Close Level 2 dialogue */
//
//        allinOne("leveltwo",
//                "http://infosfer-ab-test.s3-website-us-east-1.amazonaws.com/tmpics/quit_m.png",
//                screenshotDirectory + "/quit.png",
//                "/quit.png",
//                "/leveltwo.png",
//                "/leveltwoGray.png",
//                "/leveltwoCanny.png",
//                "/leveltwoResized.png",
//                "/leveltwoResult.png",
//                "tap",
//                "/matched7.png",
//                driver,
//                5);
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
