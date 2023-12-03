package com.tutorialsninjademo.pages;

import com.tutorialsninjademo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TopMenuPage extends Utility
{
     /*
    1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    1.2 This method should click on the menu whatever name is passed as parameter. Write the following Test:
     */

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    By desktopLink = By.linkText("Desktops");//1.1
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");//1.3
    By laptopNotebooks = By.linkText("Laptops & Notebooks");//2.1
    By laptopNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");//2.3
    By components = By.linkText("Components");//3.1
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");//3.3

    public String verifyDesktopsText() {
        return getTextFromElement(desktopsText);//1.3
    }

    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktopLink);//1.1
    }

    public void mouseHoverOnLaptopNotebooks() {
        mouseHoverToElementAndClick(laptopNotebooks);//2.1
    }

    public String verifyLaptopNotebooksText() {
        return getTextFromElement(laptopNotebooksText);//2.3
    }

    public void mouseHoverOnComponents() {
        mouseHoverToElementAndClick(components);//3.1
    }

    public String verifyComponentsText() {
        return getTextFromElement(componentsText);//3.3
    }
}


