package kmblTestRunner;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



        @RunWith(Cucumber.class)
        @CucumberOptions(features = "src/main/resources/kmbl.feature", tags = "@sprint1",glue = { "Step_definition" }, monochrome = true,

                plugin = { "pretty", "html:Report/HTMLReports.html", "json:JsonReport/Report.json",

                })
        public class Test_Execution
        {

            public static WindowsDriver driver=null;



            @BeforeClass
            public static void SetUp() throws MalformedURLException
            {

                DesiredCapabilities cap = new DesiredCapabilities();

                cap.setCapability("app", "C://Program Files (x86)//Ericom Software//PowerTerm//ptw32.exe");
                cap.setCapability("platform", "Windows");
                cap.setCapability("deviceName", "WindowsPC");

                driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);

                driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

            }

            @AfterClass
            public static void TearDown()
            {

                driver.close();

            }

        }






