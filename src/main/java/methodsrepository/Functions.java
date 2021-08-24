package methodsrepository;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import objectsrepository.MainPageOR;

public class Functions extends BaseClass {
    AndroidDriver mobileDriver;

    public Functions(AndroidDriver mobileDriver){
        this.mobileDriver = mobileDriver;
}

    public void clickOnViews() {
        MainPageOR main = new MainPageOR(mobileDriver);
        main.getViewsBTN().click();
    }

    public void animationBTN() throws InterruptedException {
        MainPageOR main = new MainPageOR(mobileDriver);
        Thread.sleep(3000);
        main.getAnimationBTN().click();
    }

    public void transitionBTN() throws InterruptedException {
        MainPageOR main = new MainPageOR(mobileDriver);
        Thread.sleep(3000);
        main.getTransitionBTN().click();
    }
}
