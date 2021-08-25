package testcasesrepository;

import basepackage.BaseClass;
import methodsrepository.ClockFunctions;
import org.testng.annotations.Test;

public class TestClock extends BaseClass {

    @Test
    public void getClock(){
        ClockFunctions c = new ClockFunctions();
        c.openClock();

    }
    @Test
    public void setTime(){
        ClockFunctions c = new ClockFunctions();
        c.setTime("2","30");
    }
}
