package testcasesrepository;

import basepackage.BaseClass;
import methodsrepository.Functions;
import objectsrepository.MainPageOR;
import org.testng.annotations.Test;

public class TestCase_MainPage extends BaseClass{


    @Test(priority=1)
    public void testViewsBTN(){
        Functions f = new Functions(mobileDriver);
        f.clickOnViews();
    }

    @Test(priority=2)
    public void testAnimationBTN() throws InterruptedException {
        Functions f = new Functions(mobileDriver);
        f.animationBTN();
    }
    @Test(priority=3)
    public void testTransitionBTN() throws InterruptedException {
        Functions f = new Functions(mobileDriver);
        f.transitionBTN();

        
    }
}
