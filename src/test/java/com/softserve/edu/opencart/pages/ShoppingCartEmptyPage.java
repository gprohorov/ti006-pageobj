package com.softserve.edu.opencart.pages;
/*
  @author   george
  @project   ti006-pageobj
  @class  ShoppingCartEmptyPage
  @version  1.0.0 
  @since 06.04.23 - 23.35
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ShoppingCartEmptyPage extends TopPart {
    private WebElement shoppingCartLabel;
    private WebElement isEmptyLabel;
    private WebElement continueButton;

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        shoppingCartLabel = driver.findElement(By.linkText("Shopping Cart"));
        isEmptyLabel = driver.findElement(By.xpath("//h1//following::p[1]"));
        continueButton = driver.findElement(By.cssSelector("a.btn.btn-primary"));
    }
    public WebElement   getShoppingCartLabel() {
      return shoppingCartLabel;
    }
    public String getShoppingCardLabelText() {
        return getShoppingCartLabel().getAttribute(TAG_ATTRIBUTE_VALUE);
    }
    public WebElement   getIsEmptyLabel() {
       return isEmptyLabel;
    }
    public String getIsEmptyLabelText() {
        return getIsEmptyLabel().getText();
    }

    public WebElement   getContinueButton() {
      return continueButton;
    }

    public String getContinueButtonText() {
        return getContinueButton().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    //-------------   functional  --------------
    public void clickContinueButton() {
        getContinueButton().click();
    }

    public HomePage clickContinue(){
        getContinueButton().click();
        return new HomePage(driver);
    }



}
