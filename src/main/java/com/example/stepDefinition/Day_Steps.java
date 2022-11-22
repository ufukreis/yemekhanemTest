package com.example.stepDefinition;

import PageObjectModel.Day_Page;
import PageObjectModel.Menu_Page;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class Day_Steps {


    private WebDriver driver;
    PageObjectModel.Day_Page Day_Page= new Day_Page();

    @And("click day button")
    public void click_day_button() {
        Day_Page.clickDayButton();

    }

    @And("click pazartesi")
    public void clickPazartesi() {
        Day_Page.clickDayButton1();

    }

    @And("click sali")
    public void clickSali() {
        Day_Page.clickDayButton2();
    }

    @And("click carsamba")
    public void clickCarsamba() {
        Day_Page.clickDayButton3();
    }

    @And("click persembe")
    public void clickPersembe() {
        Day_Page.clickDayButton4();
    }

    @And("click cuma")
    public void clickCuma() {
        Day_Page.clickDayButton5();
    }
}
