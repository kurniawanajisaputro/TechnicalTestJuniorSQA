package com.formulatrix.soalautomation.config;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:10
@Last Modified 15/12/2024 20:10
Version 1.0
*/

public class SMTPConfig {
    private static String emailUserName;
    private static String emailPassword;
    private static String emailHost;
    private static String emailPort;
    private static String emailPortSSL;
    private static String emailPortTLS;
    private static String emailAuth;
    private static String emailStartTLSEnable;
    private static String emailSMTPSocketFactoryClass;
    private static String emailSMTPTimeout;


    public SMTPConfig(String xEmailUserName,
                      String xEmailPassword,
                      String xEmailHost,
                      String xEmailPort,
                      String xEmailPortSSL,
                      String xEmailPortTLS,
                      String xEmailAuth,
                      String xEmailStartTLSEnable,
                      String xEmailSMTPSocketFactoryClass,
                      String xEmailSMTPTimeout) {
        emailUserName = xEmailUserName;
        emailPassword = xEmailPassword;
        emailHost = xEmailHost;
        emailPort = xEmailPort;
        emailPortSSL = xEmailPortSSL;
        emailPortTLS = xEmailPortTLS;
        emailAuth = xEmailAuth;
        emailStartTLSEnable = xEmailStartTLSEnable;
        emailSMTPSocketFactoryClass = xEmailSMTPSocketFactoryClass;
        emailSMTPTimeout = xEmailSMTPTimeout;
    }

    public static String getEmailUserName() {
        return emailUserName;
    }

    public static String getEmailPassword() {
        return emailPassword;
    }

    public static String getEmailHost() {
        return emailHost;
    }

    public static String getEmailPort() {
        return emailPort;
    }

    public static String getEmailPortSSL() {
        return emailPortSSL;
    }

    public static String getEmailPortTLS() {
        return emailPortTLS;
    }

    public static String getEmailAuth() {
        return emailAuth;
    }

    public static String getEmailStartTLSEnable() {
        return emailStartTLSEnable;
    }

    public static String getEmailSMTPSocketFactoryClass() {
        return emailSMTPSocketFactoryClass;
    }

    public static String getEmailSMTPTimeout() {
        return emailSMTPTimeout;
    }

}
