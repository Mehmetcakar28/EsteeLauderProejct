package com.esteeLauder.pages;

import com.esteeLauder.utils.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){PageFactory.initElements(Driver.getDriver(),this);}
}

