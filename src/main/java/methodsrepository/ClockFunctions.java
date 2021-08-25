package methodsrepository;

import basepackage.BaseClass;
import objectsrepository.ClockOR;

public class ClockFunctions extends BaseClass {

    public void openClock(){
        ClockOR or = new ClockOR(mobileDriver);
        or.getViewsBTN().click();
        or.getDateWidgets().click();
        or.getInlineBTN().click();
    }

    public void setTime(String hour,String minute){

        mobileDriver.findElementByXPath("//*[@content-desc='"+hour+"']").click();
        mobileDriver.findElementByXPath("//*[@content-desc='"+minute+"']").click();
    }
}
