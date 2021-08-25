package methodsrepository;

import basepackage.BaseClass;
import objectsrepository.AutoCompleteOR;

public class AutoCompleteFunctions extends BaseClass {

    public void enterText() throws InterruptedException {
        AutoCompleteOR or = new AutoCompleteOR(mobileDriver);
        or.getViewsBTN().click();
        or.getAutoCompleteBTN().click();
        or.getScreenTopBTN().click();
        or.getEditText().click();
        Thread.sleep(3000);
        or.getEditText().sendKeys("In");
    }
    public void scrollFun(String name){
        AutoCompleteOR or = new AutoCompleteOR(mobileDriver);
        or.getViewsBTN().click();
        or.getAutoCompleteBTN().click();
        or.getScrollBTN().click();
        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + name + "\").instance(0))");

    }

}
