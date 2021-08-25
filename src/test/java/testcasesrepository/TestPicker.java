package testcasesrepository;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidElement;
import methodsrepository.Functions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestPicker extends BaseClass {

@Test
    public void testPicker(){
        mobileDriver.findElementByXPath("//android.widget.TextView[@content-desc='Views']").click();
    Functions f = new Functions(mobileDriver);
    f.scrollFun("Picker");
        mobileDriver.findElementByXPath("//android.widget.TextView[@content-desc='Picker']").click();
        List<AndroidElement> list = mobileDriver.findElementsByClassName("android.widget.FrameLayout");
        System.out.println(list.size());
    }
}
