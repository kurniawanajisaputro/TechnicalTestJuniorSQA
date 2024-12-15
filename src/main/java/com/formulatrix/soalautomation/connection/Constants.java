package com.formulatrix.soalautomation.connection;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:12
@Last Modified 15/12/2024 20:12
Version 1.0
*/
public class Constants  {

    public static final int TIMEOUT = 15;
    public static final int TIMEOUT_DELAY = 3;
    public static final String GLOB_PARAM_DELAY = "y";
    public static final String CHROME = "Chrome";
    public static final String FIREFOX = "Firefox";
    public static final String EDGE = "Edge";
    public static final String OPERA = "Opera";
    public static final String IE = "IE";
    public static final String SAFARI = "Safari";

    public class UserData {
        private static String username;

        public static void setUsername(String user) {
            username = user;
        }

        public static String getUsername() {
            return username;
        }
    }
    public static final String URL_LOGIN = "https://www.demoblaze.com/";
}