package com.formulatrix.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 20:47
@Last Modified 15/12/2024 20:47
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

public class CartPage {
    private WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Products']")
    private WebElement logoCartPage;

    @FindBy(xpath = "//a[normalize-space()='Delete']")
    private WebElement btnDelete;
    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    private WebElement btnPlaceOrder;
    public CartPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public CartPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String CartPageValidation(){
        return logoCartPage==null?"":logoCartPage.getText();
    }

    public void SetBtnPlaceorder(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnPlaceOrder)).click();
    }
    public void delete(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDelete)).click();
    }
}