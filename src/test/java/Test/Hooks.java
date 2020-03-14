package Test;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Hooks extends Basepage {
    BrowserSelector browserSelector=new BrowserSelector();
    Loadprops loadprops= new Loadprops();

    @Test

    public void SetUpBrowser(){
        browserSelector.SetUpBrowser();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(loadprops.getProperty("url"));


    }

}
