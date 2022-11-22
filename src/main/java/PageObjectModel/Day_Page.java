package PageObjectModel;

import com.example.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day_Page extends  AbstractClass{

    WebDriver driver;

    public Day_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "gunSecButon")
    private WebElement DayButton;

    public void clickDayButton(){
        clickFunction(DayButton);
    }
    @FindBy(id = "pazartesiCheckbox")
    private WebElement DayButton1;

    public void clickDayButton1(){
        clickFunction(DayButton1);
    }
    @FindBy(id = "saliCheckbox")
    private WebElement DayButton2;

    public void clickDayButton2(){
        clickFunction(DayButton2);
    }
    @FindBy(id = "carsambaCheckbox")
    private WebElement DayButton3;

    public void clickDayButton3(){
        clickFunction(DayButton3);
    }
    @FindBy(id = "persembeCheckbox")
    private WebElement DayButton4;

    public void clickDayButton4(){
        clickFunction(DayButton4);
    }
    @FindBy(id = "cumaCheckbox")
    private WebElement DayButton5;

    public void clickDayButton5(){
        clickFunction(DayButton5);
    }

}
