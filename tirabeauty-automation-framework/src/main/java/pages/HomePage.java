package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage {

WebDriver driver;

public HomePage(WebDriver driver){
this.driver = driver;
}

By searchBox = By.xpath("//input[contains(@placeholder,'Search')]");

public void searchProduct(String product){

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

WebElement search = wait.until(
ExpectedConditions.visibilityOfElementLocated(searchBox)
);

search.sendKeys(product);

}

}
