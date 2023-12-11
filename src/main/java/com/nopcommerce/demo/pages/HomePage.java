package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Computers'])[1]")
    WebElement computerLink;

    public void clickOnComputerLink(){
        //given explicit wait
        waitUntilVisibilityOfElementLocated(computerLink, 5).click();
    clickOnElement(computerLink);
    }
}
    

