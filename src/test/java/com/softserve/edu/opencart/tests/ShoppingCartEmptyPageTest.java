package com.softserve.edu.opencart.tests;

import com.softserve.edu.opencart.pages.HomePage;
import com.softserve.edu.opencart.pages.TopPart;import org.openqa.selenium.WebElement;import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartEmptyPageTest extends TestRunnerFirst {

    private final String LABEL = "Your shopping cart is empty!";

    @Test
    public void checkEmptyCartLabel(){

        String actualLabelContent = loadApplication()
                .gotoShoppingCartEmptyPage()
                .getIsEmptyLabelText();
        Assert.assertEquals(actualLabelContent, LABEL);
    }

    @Test
    public void checkContinueButton(){
      TopPart page =  loadApplication()
                .gotoShoppingCartEmptyPage()
                .clickContinue();

      Assert.assertTrue(page instanceof HomePage);



    }

}
