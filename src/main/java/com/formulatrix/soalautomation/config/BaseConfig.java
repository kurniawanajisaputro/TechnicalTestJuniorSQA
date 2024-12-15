package com.formulatrix.soalautomation.config;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:03
@Last Modified 15/12/2024 20:03
Version 1.0
*/

public class BaseConfig {
    /** ditulis ini minimal apa kek gitu */
    private static int timeout;
    private static int delay;
    private static String baseUrl;
    private static String browser;
    private static String delayParam;

    public BaseConfig(int xTimeout,int xDelay,String xBaseUrl,String xBrowser,String xDelayParam) {
        timeout = xTimeout;
        delay = xDelay;
        baseUrl = xBaseUrl;
        browser = xBrowser;
        delayParam = xDelayParam;
    }

    public static int getTimeout() {
        return timeout;
    }

    public static int getDelay() {
        return delay;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getBrowser() {
        return browser;
    }

    public static String getDelayParam() {
        return delayParam;
    }
}
