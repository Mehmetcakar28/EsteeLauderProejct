package com.esteeLauder.pages;

import com.esteeLauder.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Brands extends BasePage{
    @FindBy(xpath = "//a[@href='/en/our-brands?r=true'][1]")
    private WebElement brand;


@FindBy(xpath = "//a[@href='/en/our-brands/tommy-hilfiger?r=true']")
private WebElement Tommyhilfiger;


@FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-7 col-md-offset-1 col-sm-offset-1']//img")///?
private WebElement impact;

    public WebElement getBrand(){
        return brand;
    }

    public WebElement getTommyhilfiger() {
        return Tommyhilfiger;
    }

    public WebElement getImpact(){
        return impact;
    }

    public void setAdmin(){
        Utils.clickWithWait(brand);
    }


}
