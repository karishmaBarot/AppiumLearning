package methodsrepository;

import basepackage.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import objectsrepository.MainPageOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Functions extends BaseClass {
    AndroidDriver mobileDriver;

    public Functions(AndroidDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public void clickOnViews() {
        MainPageOR main = new MainPageOR(mobileDriver);
        main.getViewsBTN().click();
    }

    /*
        public void animationBTN() throws InterruptedException {
            MainPageOR main = new MainPageOR(mobileDriver);
            Thread.sleep(3000);
            main.getAnimationBTN().click();
        } */
    public void seekBarBTN() throws InterruptedException {
        MainPageOR main = new MainPageOR(mobileDriver);
        Thread.sleep(3000);
        main.setSeekBarBTN().click();
    }
/*
    public void transitionBTN(){
        MainPageOR main = new MainPageOR(mobileDriver);
        Thread.sleep(3000);
        main.getTransitionBTN().click();
    } */

        public void scrollFun(String name){
            mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + name + "\").instance(0))");
        }
        public void seekBarFun() {
            WebElement seek_bar = mobileDriver.findElement(By.xpath("//android.widget.SeekBar[@resource-id='io.appium.android.apis:id/seek']"));
            int start = seek_bar.getLocation().getX();
            System.out.println("start: "+start);
            int end = seek_bar.getSize().getWidth();
            System.out.println("end: "+end);
            int y = seek_bar.getLocation().getY();
            System.out.println("y: "+y);


            TouchAction action = new TouchAction(mobileDriver);

            int moveTo = (int) (end);
            System.out.println("move to: "+moveTo);

            action.press(PointOption.point(start, y)).moveTo(PointOption.point(moveTo, y)).release().perform();
        }
    }

