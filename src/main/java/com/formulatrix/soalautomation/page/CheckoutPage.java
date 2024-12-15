package com.formulatrix.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Software Quality Assurance Automation Developer
Created on 15/12/2024 20:49
@Last Modified 15/12/2024 20:49
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
public class CheckoutPage {
    private WebDriver driver;

    @FindBy(id = "orderModalLabel")
    private WebElement Placeorder;

    @FindBy(id = "name")
    private WebElement txtFieldName;

    @FindBy(id = "country")
    private WebElement txtFieldCountry;

    @FindBy(id = "city")
    private WebElement txtFieldCity;

    @FindBy(id = "card")
    private WebElement txtFieldCard;

    @FindBy(id = "month")
    private WebElement txtFieldMonth;
    @FindBy(id = "year")
    private WebElement txtFieldYear;
    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement btnPurchase;
    @FindBy(css = "btn btn-secondary")
    private WebElement btnCancel;

    @FindBy(css = "sweet-alert  showSweetAlert visible")
    private WebElement CheckoutBerhasil;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement btnOK;

    @FindBy(xpath = "//body[@class='modal-open stop-scrolling']")
    private WebElement ValidasiCheckout;

    public CheckoutPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public CheckoutPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String CheckOutPageValidation(){
        return Placeorder==null?"":Placeorder.getText();
    }
    public void ModelCheckOut(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(ValidasiCheckout)).click();
    }
    public void SetTxtinputName(String name){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldName)).sendKeys(name);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetTxtinputCountry(String country){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldCountry)).sendKeys(country);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetTxtinputCity(String city){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldCity)).sendKeys(city);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetTxtinputCard(String card){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldCard)).sendKeys(card);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetTxtinputMonth(String month){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldMonth)).sendKeys(month);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetTxtinputYear(String year){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldYear)).sendKeys(year);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }
    public void SetBtnPurchase(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnPurchase)).click();
    }
    public void Cancel(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnCancel)).click();
    }
    public void SetBtnOK(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnOK)).click();
    }
}
