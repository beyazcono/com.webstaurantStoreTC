package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {
    public static void waitt(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void titleListMethod(String data) {
        List<WebElement> actualTitleList = Driver.getDriver().findElements(By.xpath("//span[@class='block font-semibold text-sm-1/2 leading-none mt-4 mb-0 max-h-10 hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible text-center']"));
        List<String> stringActualList = new ArrayList<>();
        for (WebElement each : actualTitleList) {
            stringActualList.add(each.getText());
        }
        boolean containsData=false;

        for (String each : stringActualList) {
            if (each.contains(data)){
                containsData=true;
                break;
            }
        }
        Assert.assertTrue("All products title do not contain 'Table' word.",containsData);
    }
}
