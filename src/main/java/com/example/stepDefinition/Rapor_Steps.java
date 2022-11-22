package com.example.stepDefinition;

import PageObjectModel.Menu_Page;
import PageObjectModel.Rapor_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Rapor_Steps {

    private WebDriver driver;
    PageObjectModel.Rapor_Page Rapor_Page= new Rapor_Page();

    @And("click rapor button")
    public void click_rapor_button() {
        Rapor_Page.clickRaporButton();


    }

    @And("click menu rapor")
    public void clickMenuRapor() {
        Rapor_Page.clickRaporButton1();

    }

    @Then("verify count")
    public void verifyCount() {
        Rapor_Page.assertCount();
        Rapor_Page.assertCount2();
        Rapor_Page.assertCount3();
        Rapor_Page.assertCount4();

    }

    @And("click kisi secim button")
    public void clickKisiSecimButton() {
    Rapor_Page.clickRaporButton2();
    }

    @Then("click gelecek kisi")
    public void clickGelecekKisi() {

    }
}
