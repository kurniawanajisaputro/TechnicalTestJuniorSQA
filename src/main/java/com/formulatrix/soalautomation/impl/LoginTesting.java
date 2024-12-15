package com.formulatrix.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 22:37
@Last Modified 15/12/2024 22:37
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import com.formulatrix.soalautomation.page.SignUpPage;
import com.formulatrix.soalautomation.page.CartPage;
import com.formulatrix.soalautomation.page.CheckoutPage;
import com.formulatrix.soalautomation.page.LoginPage;
import com.formulatrix.soalautomation.page.ItemPage;
import com.formulatrix.soalautomation.page.HomePage;
import com.formulatrix.soalautomation.util.GlobalFunction;
import com.formulatrix.soalautomation.util.DataGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Random;

public class LoginTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;
    public String Username;
    public LoginTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }
    @And("Test002 Click Button Log In")
    public void test002_click_button_log_in(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnlogin();
        extentTest.log(LogStatus.PASS, "Test002 Click Button Log In");
    }
    @And("Test002 Validasi Log In")
    public void test002_validasi_log_in(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String LoginInValidation = loginPage.LoginInValidation();
        Assert.assertEquals(LoginInValidation,"");
    }
    @And("^Test002 Input TextField (.*) Yang Valid One")
    public void test002_input_textfield_username_yang_valid_one(String username){
        String Username = Constants.UserData.getUsername();
        loginPage.setTxtUsername(Username);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField <username> Yang Valid One");
    }
    @And("^Test002 Input TextField (.*) Yang Valid Two")
    public void test002_input_textfield_password_yang_valid_one(String password){
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField <password> Yang Valid One");
    }
    @Then("Test002 Click Button Login Form")
    public void test002_click_button_log_in_form(){
        loginPage.Btnlogin();
        extentTest.log(LogStatus.PASS, "Test002 Click Button Login Form");
    }
//    @Then("Test003 Validasi website")
//    public void test003_validasi_website(){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String HomePageValidation = homePage.homePageValidation();
//        Assert.assertEquals(HomePageValidation,"nava");
//    }
}