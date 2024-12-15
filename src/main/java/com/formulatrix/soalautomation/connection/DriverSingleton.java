package com.formulatrix.soalautomation.connection;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:13
@Last Modified 15/12/2024 20:13
Version 1.0
*/
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;
    private DriverSingleton(String driver)
    {
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy)
    {
        DriverStrategy driverStrategy = DriverStrategyExecution.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public static DriverSingleton getInstance(String driver)
    {
        if(instance == null) {
            instance = new DriverSingleton(driver);
        }

        return instance;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static void closeObjectInstance()
    {
        instance = null;
        try{
            driver.quit();
        } catch(NullPointerException e){
            System.out.println("END!!");
//            	getInstance(Constants.CHROME);
        }
//        driver.quit();
    }
}
