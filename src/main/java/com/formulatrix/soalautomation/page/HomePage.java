package com.formulatrix.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 20:50
@Last Modified 15/12/2024 20:50
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import com.formulatrix.soalautomation.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@id='nava']")
    private WebElement logoDemoblaze;

    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement btnSignUp;

    @FindBy(xpath = "//a[@id='login2']")
    private WebElement btnLogin;

    @FindBy(xpath = "//a[@id='cartur']")
    private WebElement btnCart;

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    private WebElement btnSamsungGalaxyS6;

    @FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
    private WebElement btnNokiaLumia1520;

    @FindBy(xpath = "//a[normalize-space()='Nexus 6']")
    private WebElement btnNexus6;

    @FindBy(xpath = "//a[@id='logout2']")
    private WebElement btnLogOut;

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String homePageValidation() {
        return logoDemoblaze == null ? "" : logoDemoblaze.getText();
    }

    public void setBtnlogin() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogin)).click();
    }

    public void setBtnsignup() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSignUp)).click();
    }

    public void setBtncart() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnCart)).click();
    }

    public void setBtnSamsunggalaxys6() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSamsungGalaxyS6)).click();
    }

    public void setBtnNokialumia1520() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnNokiaLumia1520)).click();
    }

    public void SetBtnNexus6() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnNexus6)).click();
    }

    public void setBtnLogOut() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogOut)).click();
    }
}