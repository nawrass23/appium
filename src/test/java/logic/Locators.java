package logic;

import org.openqa.selenium.By;

public class Locators {
    public static By ADD_EVENT= By.id("com.claudivan.taskagenda:id/btNovoEvento");
    public static By CALENDAR= By.xpath("//android.widget.TextView[@text=\"Calendar\"]");
    public static By NO_PENDING_EVENTS= By.xpath("//android.widget.Button[@text=\"NO PENDING EVENT\"]");
    public static By WEEK= By.xpath("//android.widget.TextView[@text=\"Week\"]");
    public static By TODAY= By.xpath("//android.widget.TextView[@text=\"Today\"]");
    public static By SAVE= By.xpath("//android.widget.TextView[@text=\"SAVE\"]");
    public static By EVENT_NAME= By.id("com.claudivan.taskagenda:id/etTitulo");
    public static By TASK_TYPE= By.id("com.claudivan.taskagenda:id/tvTipo");
    public static By DESCRIPTION= By.id("com.claudivan.taskagenda:id/etDescricao");
    public static By REMAINDER= By.id("com.claudivan.taskagenda:id/etDescricao");
    public static By DATE = By.id("com.claudivan.taskagenda:id/btData");
    public static By confirmDate = By.xpath("//android.widget.Button[@text=\"OK\"]");
    public static By timeTap =By.id("com.claudivan.taskagenda:id/btHora");
    public static By keybord = By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to text input mode for the time input.\"]");
    public static By HOUR = By.id("android:id/input_hour");
    public static By MINUTE = By.id("android:id/input_minute");
    public static By AMPM  = By.id("android:id/am_pm_spinner");
    public static By AM= By.xpath("//android.widget.CheckedTextView[@text=\"AM\"]");
    public static By okDATE= By.id("android:id/button1");




}
