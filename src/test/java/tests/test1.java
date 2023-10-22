package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import logic.homepage;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test1 {
    private AndroidDriver<MobileElement> driver;
    private homepage homePage ;

    public test1() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.claudivan.taskagenda");
        caps.setCapability("appActivity", ".Activities.MainActivity");
        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
            homePage = new homepage(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void event(){
        // Act

        //ARRANGE
        homePage.add_new_event();
        homePage.enterEventTitle("party Event ");
        homePage.enterEventdescription("very fun partyyy");
        homePage.selectEventDate("2023-10-30");
        homePage.save();
    }
}
