package com.formulatrix.soalautomation.connection.driver;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:18
@Last Modified 15/12/2024 20:18
Version 1.0
*/
import com.formulatrix.soalautomation.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class Safari implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();

        return driver;
    }
}
