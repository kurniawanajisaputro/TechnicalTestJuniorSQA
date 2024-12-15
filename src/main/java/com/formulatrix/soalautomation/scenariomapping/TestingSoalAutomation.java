package com.formulatrix.soalautomation.scenariomapping;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 22:36
@Last Modified 15/12/2024 22:36
Version 1.0
*/

public enum TestingSoalAutomation {
    T1("Test001 Sign Up Website (user)"),
    T2("Test002 Log In Website (user)"),
    T3("Test003 Cart Samsung Galaxy S6"),
    T4("Test004 Cart Nokia Lumia 1520"),
    T5("Test005 Cart Nexus6"),
    T6("Test006 Cart Item"),
    T7("Test007 Checkout Item");
    private String testName;

    private TestingSoalAutomation(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}