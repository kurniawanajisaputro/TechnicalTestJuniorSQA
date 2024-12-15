package com.formulatrix.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 20:55
@Last Modified 15/12/2024 20:55
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
public class SignUpPage {
    private WebDriver driver;

    @FindBy(id = "signInModalLabel")
    private WebElement logoSignUp;

    @FindBy(id = "sign-username")
    private WebElement txtFieldUsername;

    @FindBy(id = "sign-password")
    private WebElement txtFieldPassword;

    @FindBy(id = "message-text")
    private WebElement validasiform;

    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement btnSignUp;

    @FindBy(css = "btn btn-secondary")
    private WebElement btnCansel;

    @FindBy(css = "button.btn.btn-primary[onclick='send()']")
    private WebElement btnSendMessage;


    public SignUpPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public SignUpPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String SignUpValidation(){
        return logoSignUp==null?"":logoSignUp.getText();
    }
    public String FormValidation(){
        return validasiform==null?"":validasiform.getText();
    }
    public void setTxtUsername(String username){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtFieldUsername)).sendKeys(username);
    }

    public void setTxtPassword(String password){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtFieldPassword)).sendKeys(password);
    }
    public void BtnsignUp(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSignUp)).click();
    }
    public void Cancel(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnCansel)).click();
    }
//    public void clickSendMessage(){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.elementToBeClickable(btnSendMessage)).click();
//    }
}
