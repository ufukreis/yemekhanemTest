package PageObjectModel;

import com.example.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class AbstractClass {


    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);

    }
    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My message:"+ actual.getText());
    }
    public void alertButon(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }


}
