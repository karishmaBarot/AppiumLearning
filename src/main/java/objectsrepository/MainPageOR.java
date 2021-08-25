package objectsrepository;

import basepackage.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageOR extends BaseClass{

    public MainPageOR(AppiumDriver mobileDriver){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver),this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Views']")
    WebElement viewsBTN;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Animation']")
    WebElement animationBTN;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='3D Transition']")
    WebElement transitionBTN;

    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Seek Bar\"]")
    WebElement seekBarBTN;



    public WebElement getViewsBTN(){
        return viewsBTN;
    }
    public WebElement getAnimationBTN(){
        return animationBTN;
    }
    public WebElement getTransitionBTN(){
        return transitionBTN;
    }

    public WebElement setSeekBarBTN() {
        return seekBarBTN;
    }
}
