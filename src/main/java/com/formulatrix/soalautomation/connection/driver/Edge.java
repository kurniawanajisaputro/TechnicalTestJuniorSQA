package com.formulatrix.soalautomation.connection.driver;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:15
@Last Modified 15/12/2024 20:15
Version 1.0
*/
import com.formulatrix.soalautomation.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Edge implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        return driver;
    }
}
