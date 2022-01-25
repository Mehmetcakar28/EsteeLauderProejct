package com.esteeLauder.step_definitions;

import com.esteeLauder.pages.Brands;
import com.esteeLauder.utils.Driver;
import com.esteeLauder.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import javax.rmi.CORBA.Util;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class stepDefinitions {
    Brands tommy = new Brands();
    WebDriver driver;



    @Given("The user want to go Estee Lauder companies main page")
    public void the_user_want_to_go_estee_lauder_companies_main_page() {
        System.out.println("User should be able to navigate to Tommy Hilfiger products under Our Brands tab");
        Driver.getDriver().get("https://www.elcompanies.com/en");
        Utils.hardWait(6000);
    }

    @When("The user want to click Our Brands")
    public void the_user_want_to_click_OUr_brands() {
        System.out.println("click Our brands tab");
        tommy.getBrand().click();
        driver=Driver.getDriver();


        Utils.hardWait(5000);
        WebElement maco = driver.findElement(By.xpath("//a[.='NOT THIS TIME']")); //?
       Utils.clickWithWait(maco); //?
       // Utils.clickWithWait(tommy.getTommyhilfiger());

    }

    @Then("The user want to navigated to the page that has only TommyHilfiger products")
    public void the_user_want_to_navigated_to_the_page_that_has_only_tommy_hilfiger_products() throws AWTException {
        System.out.println("Brands");

       // tommy.getBrand().click();
        //JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,3999)");

        Utils.hardWait(5000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);

        driver.findElement(By.xpath("//a[@href='/en/our-brands/tommy-hilfiger']//div[@class='logoItemImage']")).click();


    }

    @Then("The user want to click Impact Eau De Toilette 100ml")
    public void the_user_want_to_click_impact_eau_de_toilette_100ml() {
        tommy.getImpact().click();
        Set handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();

        String mainWindow= it.next();
        String impactWindow= it.next();

        driver.switchTo().window(mainWindow); //note= we can switch back main window

    }
}


