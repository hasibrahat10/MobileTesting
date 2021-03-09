package testRunner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSetup {
    protected static AndroidDriver driver;
    private static DesiredCapabilities caps = new DesiredCapabilities();

    protected static void setUpDriver() {
        try {
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S8+");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1200");
            caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/sorolipi.apk");
            caps.setCapability(MobileCapabilityType.FULL_RESET, "true");
            caps.setCapability(MobileCapabilityType.NO_RESET, "false");
            Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected static void tearDownDriver() {
//        if (driver != null)
//            driver.quit();
    }

}
