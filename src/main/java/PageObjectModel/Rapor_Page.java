package PageObjectModel;

import com.example.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rapor_Page extends AbstractClass{
    WebDriver driver;

    public Rapor_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);


    }

    @FindBy(linkText = "Rapor Ekranları")
    private WebElement RaporButton;

    public void clickRaporButton(){
        clickFunction(RaporButton);
    }

    @FindBy(id = "Corba_SecimSayisi_0")
    private WebElement succesCount;


    public void assertCount(){
        Assertion(succesCount,"1");

    }
    @FindBy(id = "AnaYemek1_SecimSayisi_0")
    private WebElement succesCount2;


    public void assertCount2(){
        Assertion(succesCount2,"1");

    }

    @FindBy(id = "AnaYemek2_SecimSayisi_0")
    private WebElement succesCount3;


    public void assertCount3(){
        Assertion(succesCount3,"1");

    }
    @FindBy(id = "Aperatif_SecimSayisi_0")
    private WebElement succesCount4;


    public void assertCount4(){
        Assertion(succesCount4,"1");

    }
    @FindBy(id= "istenilenMenulerButonu")
    private WebElement RaporButton1;

    public void clickRaporButton1(){
        clickFunction(RaporButton1);
    }
    @FindBy(id= "kisiSecimleriButonu")
    private WebElement RaporButton2;

    public void clickRaporButton2(){
        clickFunction(RaporButton2);
    }
    @FindBy(id= "gelecekKisiSayisiButonu")
    private WebElement RaporButton3;

    public void clickRaporButton3(){
        clickFunction(RaporButton3);
    }
}
