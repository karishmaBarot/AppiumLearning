package objectsrepository;

import basepackage.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ClockOR extends BaseClass {

    public ClockOR(AndroidDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Views']")
    WebElement viewsBTN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Date Widgets']")
    WebElement dateWidgets;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='2. Inline']")
    WebElement inlineBTN;



    public WebElement getViewsBTN(){
        return viewsBTN;
    }

    public WebElement getDateWidgets() {
        return dateWidgets;
    }

    public WebElement getInlineBTN() {
        return inlineBTN;
    }



}
