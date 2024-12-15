package com.formulatrix.soalautomation.connection;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:14
@Last Modified 15/12/2024 20:14
Version 1.0
*/
import com.formulatrix.soalautomation.connection.driver.*;
public class DriverStrategyExecution {
    public static DriverStrategy chooseStrategy(String strategy) {

        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();
            case Constants.FIREFOX:
                return new Firefox();
            case Constants.EDGE:
                return new Edge();
            case Constants.SAFARI:
                return new Safari();
            case Constants.IE:
                return new InternetExplorer();
            case Constants.OPERA:
                return new Opera();
            default:
                return null;
        }
    }
}
