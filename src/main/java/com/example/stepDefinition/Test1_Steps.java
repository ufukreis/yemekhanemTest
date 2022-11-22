package com.example.stepDefinition;

import PageObjectModel.Menu_Page;
import com.example.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Test1_Steps {

    private WebDriver driver;
    PageObjectModel.Menu_Page Menu_Page= new Menu_Page();
    @Given("open login page")
    public void open_login_page() throws Throwable {
     driver = Driver.getDriver();

     driver.manage().window().maximize();
     driver.get("https://localhost:7226/");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Given("click yemek menu")
    public void click_yemek_menu() {

      Menu_Page.clickYemekMenuButton();
    }
    @Given("click corba")
    public void click_corba() {
    Menu_Page.clickYemekMenuButton1();
    }
    @Given("click ana yemek")
    public void click_ana_yemek() {
        Menu_Page.clickYemekMenuButton3();

    }
    @When("click on secimi tamamla")
    public void click_on_secimi_tamamla() {
        Menu_Page.clicksecimiTamamlaButton();

    }
    @Then("hatali")
    public void hatali() {
        Menu_Page.alertButon();


    }

    @And("click ana yemek2")
    public void clickAnaYemek() {
        Menu_Page.clickYemekMenuButton4();

    }

    @And("click aperatif")
    public void clickAperatif() {
   Menu_Page.clickYemekMenuButton5();
    }

    @And("click corba1")
    public void clickCorba() {
        Menu_Page.clickYemekMenuButton6();
    }

    @And("click ana yemek3")
    public void clickAnaYemek3() {
        Menu_Page.clickYemekMenuButton7();
    }

    @And("click ana yemek4")
    public void clickAnaYemek4() {
        Menu_Page.clickYemekMenuButton8();
    }

    @And("click aperatif1")
    public void clickAperatif1() {
        Menu_Page.clickYemekMenuButton9();
    }

    @Then("click tekrar sec")
    public void clickTekrarSec() {
        Menu_Page.clickTekrarSecButton();
    }

    @Then("click cıkıs")
    public void clickCıkıs() {
        Menu_Page.clickCıkısButton();
    }
}
