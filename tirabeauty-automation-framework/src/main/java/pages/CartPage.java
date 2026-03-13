package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CartPage {

WebDriver driver;

public CartPage(WebDriver driver){
this.driver = driver;
}

By addToCart = By.xpath("//button[contains(text(),'Add to Bag')]");

public void addProduct(){

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

WebElement button = wait.until(
ExpectedConditions.elementToBeClickable(addToCart)
);

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].scrollIntoView(true);", button);

button.click();

}


}
