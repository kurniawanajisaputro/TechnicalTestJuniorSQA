package com.formulatrix.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 22:38
@Last Modified 15/12/2024 22:38
Version 1.0
*/
import com.formulatrix.soalautomation.connection.Constants;
import com.formulatrix.soalautomation.page.SignUpPage;
import com.formulatrix.soalautomation.page.CartPage;
import com.formulatrix.soalautomation.page.CheckoutPage;
import com.formulatrix.soalautomation.page.LoginPage;
import com.formulatrix.soalautomation.page.ItemPage;
import com.formulatrix.soalautomation.page.HomePage;
import com.formulatrix.soalautomation.util.DataGenerator;
import com.formulatrix.soalautomation.util.GlobalFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.NoAlertPresentException;

import java.util.Random;

import static com.formulatrix.soalautomation.util.GlobalFunction.delay;

public class SignUpTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;

    private DataGenerator dataGenerator = new DataGenerator();
    private Random r = new Random();
    public String usernameInput;

    public SignUpTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test001 Membuka Halaman Website")
    public void test001_membuka_halaman_login(){
        delay(Constants.TIMEOUT_DELAY);
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test001 Membuka Website");
    }
    @And("Test001 Click Button SignUp")
    public void test001_click_signup(){
        delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnsignup();
        extentTest.log(LogStatus.PASS, "Test001 Click Button SignUp");
    }
    @And("Test001 Validasi SignUp")
    public void test001_validasi_signup(){
        delay(Constants.TIMEOUT_DELAY);
        String SignUpValidation = signUpPage.SignUpValidation();
        Assert.assertEquals(SignUpValidation,"Sign up");
    }
    @And("^Test001 Input TextField (.*) Yang Valid One")
    public void test001_input_textfield_username_yang_valid_one(String username){
        usernameInput = String.valueOf(r.nextLong(10000000000000L,99999999999999L));
        Constants.UserData.setUsername(usernameInput);;
        signUpPage.setTxtUsername(usernameInput);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <username> Yang Valid One");
    }
    @And("^Test001 Input TextField (.*) Yang Valid Two")
    public void test001_input_textfield_password_yang_valid_one(String password){
        delay(Constants.TIMEOUT_DELAY);
        signUpPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <password> Yang Valid One");
    }
    @And("Test001 Validasi Form Sign UP")
    public void test001_validasi_form_sign_up(){
        delay(Constants.TIMEOUT_DELAY);
        String FormValidation = signUpPage.FormValidation();
        Assert.assertEquals(FormValidation,"");
    }
    @And("Test001 Click Button SignUp Form")
    public void test001_click_button_signup(){
        delay(Constants.TIMEOUT_DELAY);
        signUpPage.BtnsignUp();
        extentTest.log(LogStatus.PASS, "Test001 Click Button SignUp");
    }
    @And("Test001 Pop Out Sign Up Berhasil")
    public void test001_pop_out_sign_up_berhasil(){
        delay(Constants.TIMEOUT_DELAY);
        delay(3);
        driver.switchTo().alert().accept();
    }
    @Then("Test001 Validasi website")
    public void test001_validasi_website(){
        delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"\n" +
                "      PRODUCT STORE");
    }
}
