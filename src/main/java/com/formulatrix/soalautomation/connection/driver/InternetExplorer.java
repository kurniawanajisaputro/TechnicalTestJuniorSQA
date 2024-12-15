package com.formulatrix.soalautomation.connection.driver;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:16
@Last Modified 15/12/2024 20:16
Version 1.0
*/
import com.formulatrix.soalautomation.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class InternetExplorer implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();

        return driver;
    }

}
