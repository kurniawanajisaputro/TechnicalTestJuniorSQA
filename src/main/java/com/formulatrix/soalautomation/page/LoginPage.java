package com.formulatrix.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 20:53
@Last Modified 15/12/2024 20:53
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import com.formulatrix.soalautomation.connection.DriverSingleton;
import com.formulatrix.soalautomation.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "signInModalLabel")
    private WebElement logoLoginIn;

    @FindBy(id = "loginusername")
    private WebElement txtFieldUsername;

    @FindBy(id = "loginpassword")
    private WebElement txtFieldPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement btnLogin;

    @FindBy(xpath = "btn btn-secondary")
    private WebElement btnCansel;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String LoginInValidation() {
        return logoLoginIn == null ? "" : logoLoginIn.getText();
    }

    public void setTxtUsername(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldUsername)).sendKeys(username);
        } catch (Exception e) {
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }

    public void setTxtPassword(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldPassword)).sendKeys(password);
        } catch (Exception e) {
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }

    public void Btnlogin() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogin)).click();
    }

    public void Cancel() {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnCansel)).click();
    }
}
