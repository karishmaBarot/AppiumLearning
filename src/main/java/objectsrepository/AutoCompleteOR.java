package objectsrepository;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AutoCompleteOR extends BaseClass {

    public AutoCompleteOR(AndroidDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Views']")
    WebElement viewsBTN;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Auto Complete']")
    WebElement autoCompleteBTN;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='1. Screen Top']")
    WebElement screenTopBTN;

    @AndroidFindBy(xpath="//android.widget.EditText[@index='1']")
    WebElement editText;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='3. Scroll']")
    WebElement scrollBTN;

    public WebElement getViewsBTN(){
        return viewsBTN;
    }

    public WebElement getAutoCompleteBTN() {
        return autoCompleteBTN;
    }

    public WebElement getScreenTopBTN() {
        return screenTopBTN;
    }

    public WebElement getEditText() {
        return editText;
    }

    public WebElement getScrollBTN() {
        return scrollBTN;
    }
}
