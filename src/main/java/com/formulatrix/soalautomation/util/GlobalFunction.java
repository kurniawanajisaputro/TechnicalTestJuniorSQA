package com.formulatrix.soalautomation.util;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:24
@Last Modified 15/12/2024 20:24
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class GlobalFunction {
    public static int testCount = 0;
    public static int countOutline = 1;
    public static String rootProject = System.getProperty("user.dir");
    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
                +screenshotName+"_"+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

    public static void dropDownlist(WebDriver driver, String strXpath){
        List<WebElement> d =driver.findElements(By.xpath(strXpath));
        Iterator<WebElement> itr = d.iterator();

        int intIter = 1;
        String value = "";
        while (itr.hasNext()){
            WebElement element = itr.next();
            value = element.getText();
            System.out.println("Element get Text : "+value);
        }
    }

    /** ini untuk konfigurasi di seluruh step */
    public static  void delay(int intDetik){
        if(Constants.GLOB_PARAM_DELAY.equalsIgnoreCase("y")){
            try {
                Thread.sleep(intDetik*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /** ini untuk proses Asyncronous */
    public static  void delay(int intDetik,String strNull){
        try {
            Thread.sleep(intDetik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
