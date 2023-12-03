package com.tutorialsninjademo.pages;

import com.tutorialsninjademo.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility
{
    By sort = By.id("input-sort");//1.3
    By selectProduct = By.linkText("MacBook");//2.4
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]"); //2.5
    By addToCart = By.xpath("//button[@id='button-cart']");//2.6
    By successText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");//2.7
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");//2.8
    By shoppingCartText = By.xpath("//div[@id='content']//h1");//2.9
    By macBookText1 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");//2.10
    By changeQtyLink = By.xpath("//input[contains(@name, 'quantity')]");//2.11
    By updateQtyLink = By.xpath("//button[contains(@data-original-title, 'Update')]");//2.12
    By modifiedCartText = By.xpath("//div[@id='checkout-cart']/div[1]");//2.13
    By totalAmountText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");//2.14
    By checkOut = By.xpath("//a[@class='btn btn-primary']");//2.15
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");//2.16
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");//2.17
    By guestCheckOut = By.xpath("//input[@value='guest']");//2.18
    By continueButton = By.xpath("//input[@id='button-account']");//2.19
    By firstName = By.xpath("//input[@id='input-payment-firstname']");//2.20.1
    By lastName = By.xpath("//input[@id='input-payment-lastname']");//2.20.2
    By email = By.xpath("//input[@id='input-payment-email']");//2.20.3
    By telephone = By.xpath("//input[@id='input-payment-telephone']");//2.20.4
    By address1 = By.xpath("//input[@id='input-payment-address-1']");//2.20.5
    By city = By.xpath("//input[@id='input-payment-city']");//2.20.6
    By postcode = By.xpath("//input[@id='input-payment-postcode']");//2.20.7
    By country = By.xpath("//select[@id='input-payment-country']");//2.20.8
    By region = By.xpath("//select[@id='input-payment-zone']");//2.20.9
    By continueButtonLast = By.xpath("//input[@id='button-guest']");//2.21
    By comments = By.xpath("//textarea[@name='comment']");//2.22
    By agree = By.xpath("//input[@type='checkbox']");//2.23
    By guestContinueButton = By.xpath("//input[@name = 'agree']");//2.24
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");//2.25


    public void selectSortBy(String sortBy) {selectByVisibleTextFromDropDown(sort, sortBy);}//1.3


    public void selectProductMacBook() {clickOnElement(selectProduct);}//2.4

    public String verifyMacBookText() {
        return getTextFromElement(macBookText);
    }//2.5

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }//2.6

    public String addCartMessage() {
        return getTextFromElement(successText);
    }//2.7

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }//2.8

    public String verifyTheShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }//2.9

    public String verifyMacBookText1() {
        return getTextFromElement(macBookText1);
    }//2.10

    public void changeTheQty() {
        driver.findElement(changeQtyLink).clear();
        sendTextToElement(changeQtyLink, "2");
    }//2.11

    public void updateTheQty() {
        clickOnElement(updateQtyLink);
    }//2.12

    public String verifyTheModifyCartText() {
        return getTextFromElement(modifiedCartText);
    }//2.13

    public String verifyTheTotalAmount() {
        return getTextFromElement(totalAmountText);
    }//2.14

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }//1.15

    public String verifyCheckOutText() {
        return getTextFromElement(checkOutText);
    }//2.16

    public String verifyNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }//2.17

    public void clickOnGuestCheckOut() {
        clickOnElement(guestCheckOut);
    }//2.18

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }//2.19

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
    }//2.20.1

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }//2.20.2

    public void enterEmail(String value) {
        sendTextToElement(email, value);
    }//2.20.3

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }//2.20.4

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
    }//2.20.5
    public void enterCity(String value) {
        sendTextToElement(city, value);
    }//2.20.6
    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
    }//2.20.7
    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
    }//2.20.8
    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
    }//2.20.9

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
    }//2.21

    public void enterComments(String value) {
        sendTextToElement(comments, value);
    }//2.22

    public void clickOnAgree() {
        clickOnElement(agree);
    }//2.23

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
    }//2.24


    public String verifyPaymentWarningText() {
        return getTextFromElement(warningText);
    }//2.25
}
