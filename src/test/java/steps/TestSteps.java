package steps;

import cucumber.api.java.en.When;
import testRunner.TestSetup;

public class TestSteps extends TestSetup {

    @When("^I am on the home page$")
    public void iAmOnTheHomePage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}