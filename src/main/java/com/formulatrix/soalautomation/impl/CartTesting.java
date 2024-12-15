package com.formulatrix.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 22:33
@Last Modified 15/12/2024 22:33
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static com.formulatrix.soalautomation.util.GlobalFunction.delay;

public class CartTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;

    public CartTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        cartPage = new CartPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test003 Validasi website")
    public void test003_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"PRODUCT STORE");
    }
    @And("Test003 Membuka Item Samsung Galaxy S6")
    public void test003_membuka_item_samsung_galaxy_s6(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnSamsunggalaxys6();
        extentTest.log(LogStatus.PASS, "Test003 Click Button Item Samsung Galaxy S6");
    }
    @And("Test003 Click Button Add To Cart")
    public void test003_click_button_add_to_cart(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnAddtoCart();
        extentTest.log(LogStatus.PASS, "Test003 Click Button Add To Cart");
    }
    @Then("Test003 Klik Ok Pop Up")
    public void test003_klik_ok_pop_up() {
        delay(Constants.TIMEOUT_DELAY);
        delay(3);
        driver.switchTo().alert().accept();
    }
    @When("Test004 Click Button Home")
    public void test003_click_button_home(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnHome();
        extentTest.log(LogStatus.PASS, "Test004 Click Button Home");
    }
    @And("Test004 Validasi website")
    public void test004_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"PRODUCT STORE");
    }
    @And("Test004 Membuka Item Nokia Lumia 1520")
    public void test004_membuka_item_nokia_lumia_1520(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnNokialumia1520();
        extentTest.log(LogStatus.PASS, "Test004 Click Button Item Nokia Lumia 1520");
    }
    @And("Test004 Click Button Add To Cart")
    public void test004_click_button_add_to_cart(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnAddtoCart();
        extentTest.log(LogStatus.PASS, "Test004 Click Button Add To Cart");
    }
    @Then("Test004 Klik Ok Pop Up")
    public void test004_klik_ok_pop_up() {
        delay(Constants.TIMEOUT_DELAY);
        delay(3);
        driver.switchTo().alert().accept();
    }
    @When("Test005 Click Button Home")
    public void test005_click_button_home(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnHome();
        extentTest.log(LogStatus.PASS, "Test005 Click Button Home");
    }
    @And("Test005 Validasi website")
    public void test005_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"PRODUCT STORE");
    }
    @And("Test005 Membuka Item Nexus6")
    public void test005_membuka_item_Nexus6(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.SetBtnNexus6();
        extentTest.log(LogStatus.PASS, "Test005 Click Button Item Nexus6");
    }
    @And("Test005 Click Button Add To Cart")
    public void test005_click_button_add_to_cart(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnAddtoCart();
        extentTest.log(LogStatus.PASS, "Test005 Click Button Add To Cart");
    }
    @Then("Test005 Klik Ok Pop Up")
    public void test005_klik_ok_pop_up() {
        delay(Constants.TIMEOUT_DELAY);
        delay(3);
        driver.switchTo().alert().accept();
    }
    @When("Test006 Click Button Cart")
    public void test006_click_button_cart(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        itemPage.SetBtnCart();
        extentTest.log(LogStatus.PASS, "Test006 Click Button Cart");
    }
    @And("Test006 Validasi Cart Page")
    public void test006_validasi_cart_page(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String CartPageValidation = cartPage.CartPageValidation();
        Assert.assertEquals(CartPageValidation,"Products");
    }
    @Then("Test006 Click Button Place Order")
    public void test006_click_button_place_order(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        cartPage.SetBtnPlaceorder();
        extentTest.log(LogStatus.PASS, "Test006 Click Button Place Order");
    }
}
