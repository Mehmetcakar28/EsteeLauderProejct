package com.esteeLauder.step_definitions;

import com.esteeLauder.utils.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(Scenario scenario){

        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void close(Scenario scenario){
        if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
       /* Driver.closeDriver();
        Driver.quitDriver();*/
    }


}
