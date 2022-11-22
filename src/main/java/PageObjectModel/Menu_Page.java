package PageObjectModel;

import com.example.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu_Page extends AbstractClass {

WebDriver driver;

public Menu_Page(){
    driver = Driver.getDriver();
    PageFactory.initElements(driver,this);
}

@FindBy(id = "yemekMenuSecButon")
    private WebElement yemekMenuButton;

public void clickYemekMenuButton(){
    clickFunction(yemekMenuButton);
}
    @FindBy(id = "SecildiMiCheckboxCorba2")
    private WebElement yemekMenuButton1;

    public void clickYemekMenuButton1(){
        clickFunction(yemekMenuButton1);
    }
    @FindBy(id = "SecildiMiCheckboxAnaYemek1_1")
    private WebElement yemekMenuButton3;

    public void clickYemekMenuButton3(){
        clickFunction(yemekMenuButton3);
    }

    @FindBy(id = "SecildiMiCheckboxAnaYemek2_0")
    private WebElement yemekMenuButton4;

    public void clickYemekMenuButton4(){
        clickFunction(yemekMenuButton4);
    }
    @FindBy(id = "SecildiMiCheckboxAperatif2")
    private WebElement yemekMenuButton5;

    public void clickYemekMenuButton5(){
        clickFunction(yemekMenuButton5);
    }
    @FindBy(id = "SecildiMiCheckboxCorba4")
    private WebElement yemekMenuButton6;

    public void clickYemekMenuButton6(){
        clickFunction(yemekMenuButton6);
    }
    @FindBy(id = "SecildiMiCheckboxAnaYemek1_0")
    private WebElement yemekMenuButton7;

    public void clickYemekMenuButton7(){
        clickFunction(yemekMenuButton7);
    }
    @FindBy(id = "SecildiMiCheckboxAnaYemek2_1")
    private WebElement yemekMenuButton8;

    public void clickYemekMenuButton8(){
        clickFunction(yemekMenuButton8);
    }
    @FindBy(id = "SecildiMiCheckboxAperatif1")
    private WebElement yemekMenuButton9;

    public void clickYemekMenuButton9(){
        clickFunction(yemekMenuButton9);
    }
    @FindBy(id = "SecimiTamamlaButon")
    private WebElement secimiTamamlaButton;

    public void clicksecimiTamamlaButton(){
        clickFunction(secimiTamamlaButton);
    }

    @FindBy(id = "TekrarSecButon")
    private WebElement TekrarSecButton;

    public void clickTekrarSecButton(){
        clickFunction(TekrarSecButton);
    }

    @FindBy(id = "CikisButon")
    private WebElement CıkısButton;

    public void clickCıkısButton(){
        clickFunction(CıkısButton);
    }

}
