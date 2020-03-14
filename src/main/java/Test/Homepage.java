package Test;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class Homepage extends Utils{
    Loadprops loadprops= new Loadprops();
    BrowserSelector browserSelector=new BrowserSelector();

    public void UserhomePage() {
        browserSelector.SetUpBrowser();

    }

    public void ClickOnPopUp(){
     driver.findElement(By.xpath("//a[@class=\"black\"]")).click();
    }

    public void GetTitle(){
        Set<String> handler=driver.getWindowHandles();
        Iterator<String> it = handler.iterator();

        String parentWindowId = it.next();
        System.out.println("ParentWindowID ::"+parentWindowId);

        String childWindowId = it.next();
        System.out.println("ChildWindowID ::"+childWindowId);

        driver.switchTo().window(childWindowId);

        System.out.println("child window title "+driver.getTitle());

        driver.close();
        driver.switchTo().window(parentWindowId);

        System.out.println("ParentWindow Title::"+driver.getTitle());

    }

    public void ClosePopUp(){
        driver.quit();
    }
}
