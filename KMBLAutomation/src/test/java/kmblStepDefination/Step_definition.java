package kmblStepDefination;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import kmblTestRunner.Test_Execution;

public class Step_definition
{

    public static WindowsDriver driver = Test_Execution.driver;
    @Given("^user launches the application$")
    public void user_launches_the_application()
    {

        driver.findElementByName("Close").click();
        System.out.println("application launch");
    }

    @When("^user close the application$")
    public void user_close_the_application()
    {
        System.out.println("close the app");
    }}