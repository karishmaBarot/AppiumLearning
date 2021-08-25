package testcasesrepository;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidElement;
import methodsrepository.AutoCompleteFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestAutoComplete extends BaseClass {

   /*
    @Test
    public void enterTextTest() throws InterruptedException {
        AutoCompleteFunctions fun = new AutoCompleteFunctions();
        fun.enterText();
        //List<WebElement> list = mobileDriver.findElementsByClassName("android.widget.FrameLayout");
        List<AndroidElement> list = mobileDriver.findElements(By.className("android.widget.FrameLayout"));
        System.out.println(list.size());
        Thread.sleep(3000);

        for(AndroidElement name : list){
            System.out.println("Country name: "+name.getText());
            if(name.getText().equalsIgnoreCase("India")){
                name.click();
                break;
            }
        }
    } */

    @Test
    public void scrollTest(){
        AutoCompleteFunctions fun = new AutoCompleteFunctions();
        fun.scrollFun("BUTTON");
    }
}
