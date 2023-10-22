package logic;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class homepage extends basePgae {
    private MobileElement addButton;
    private MobileElement calendar;
    private MobileElement pending_events;
    private MobileElement today;
    private MobileElement eventTitle;
    private MobileElement eventdescription;
    private MobileElement saveButton;
    private  MobileElement dateField;
    private MobileElement  dateElement;
    private MobileElement OK;
    private MobileElement hourValue;
    private MobileElement minuteValue;
    private MobileElement AmTap;


    public homepage(MobileDriver driver) {
        super(driver);
    }


    public void add_new_event(){
        addButton = (MobileElement) driver.findElement(Locators.ADD_EVENT);
        addButton.click();
        today = (MobileElement) waitTillVisible(driver,10,Locators.TODAY);
        today.click();

    }
    public void enterEventTitle(String title) {
       eventTitle = (MobileElement) driver.findElement(Locators.EVENT_NAME);
        eventTitle.sendKeys(title);
    }
    public void enterEventdescription(String description) {
        eventdescription = (MobileElement) driver.findElement(Locators.EVENT_NAME);
        eventdescription.sendKeys(description);
    }
    public void save(){
       saveButton= (MobileElement) driver.findElement(Locators.SAVE);
        saveButton.click();
    }

    public void selectEventDate(String date) {
        dateField = (MobileElement) driver.findElement(Locators.DATE);
        dateField.click();
        String dynamicXPath = String.format("//android.view.View[@content-desc=\"%s\"]", date);
        try {
            dateElement = (MobileElement) driver.findElement(By.xpath(dynamicXPath));
            dateElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Date element not found: " + date);
        }
        OK = (MobileElement) driver.findElement(Locators.confirmDate);
        OK.click();
    }

    public void setHour(String hour) {
        hourValue = (MobileElement) driver.findElement(Locators.HOUR);
        hourValue.sendKeys(hour);
    }
    public void setMinute(String minutes){
        minuteValue= (MobileElement) driver.findElement(Locators.MINUTE);
        minuteValue.sendKeys(minutes);
    }
    public void switchToAm(){
        AmTap= (MobileElement) driver.findElement(Locators.AMPM);
        AmTap.click();
        waitTillClickable(driver,10, Locators.AM);
    }



    public void go_to_calender(){
        calendar= (MobileElement) driver.findElement(Locators.CALENDAR);
        calendar.click();
    }
    public void check_pending_events(){
        pending_events= (MobileElement) driver.findElement(Locators.NO_PENDING_EVENTS);
        pending_events.click();
    }

    public void createEvent(){

    }
}
