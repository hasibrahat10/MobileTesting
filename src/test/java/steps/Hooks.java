package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import testRunner.TestSetup;

public class Hooks extends TestSetup {
    @Before
    public static void startDriver() {
        setUpDriver();
        sleepFor(2);

        driver.findElement(By.id("games")).click();
        sleepFor(2);
        driver.findElement(By.id("hojoborolo")).click();

        sleepFor(4);

        driver.findElement(By.id("level_one")).click();
        sleepFor(3);


    }

    @After
    public static void stopDriver() {
        tearDownDriver();
    }
}
