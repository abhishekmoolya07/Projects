package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

public static WebDriver driver;

@Before
public void setup(){

WebDriverManager.chromedriver().setup();

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


driver.get("https://www.tirabeauty.com");

}

@After
public void teardown(){

driver.quit();

}

}
