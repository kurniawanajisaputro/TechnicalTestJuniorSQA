package com.formulatrix.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 22:35
@Last Modified 15/12/2024 22:35
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import com.formulatrix.soalautomation.connection.DriverSingleton;
import com.formulatrix.soalautomation.scenariomapping.TestingSoalAutomation;
import com.formulatrix.soalautomation.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginOutlineHooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports(GlobalFunction.rootProject+"/practiceautomation-report/extentreport/login.html");
    private static TestingSoalAutomation[] tests = TestingSoalAutomation.values();
    private static final int[] DATA_OUTLINE = {1,1,1,1,1,1,1};
    private String testReport = "";

    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        testReport = tests[GlobalFunction.testCount].getTestName();
        extentTest = reports.startTest(testReport);
        if(GlobalFunction.countOutline==DATA_OUTLINE[GlobalFunction.testCount])
        {
            GlobalFunction.countOutline=0;
            GlobalFunction.testCount++;
        }
        GlobalFunction.countOutline++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            String screenshotPath = GlobalFunction.getScreenshot(driver, "PTA_LoginOutlineHooks"+scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));;
        }
    }

    @After
    public void closeObject() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void closeBrowser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
        DriverSingleton.closeObjectInstance();
    }
}

