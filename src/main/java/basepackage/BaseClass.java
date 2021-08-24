package basepackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AndroidDriver<AndroidElement> mobileDriver;
    public AppiumDriverLocalService appiumService;
    String appiumServiceUrl;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        File filename = new File("Mobile Builds","ApiDemos-debug.apk");

        boolean flag = checkIfServerIsRunning(4723);
        if(!flag) {
            appiumService = AppiumDriverLocalService.buildDefaultService();
            appiumService.start();
        }
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3_XL_API_28");
        dc.setCapability(MobileCapabilityType.APP,filename.getAbsolutePath());
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        dc.setCapability("platformName","Android");
        dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");

        mobileDriver = new AndroidDriver<>(new URL(appiumServiceUrl), dc);
        mobileDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    }

    public boolean checkIfServerIsRunning(int port){
        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {

            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    @AfterClass
    public void tearDown(){
        appiumService.stop();
    }
}
