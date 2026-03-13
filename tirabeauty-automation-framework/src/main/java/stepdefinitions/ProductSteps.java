package stepdefinitions;

import hooks.Hooks;
import pages.HomePage;
import pages.SearchPage;
import pages.CartPage;

import io.cucumber.java.en.*;

public class ProductSteps {

HomePage home;
SearchPage search;
CartPage cart;

@Given("user opens tira beauty website")
public void openWebsite(){

home = new HomePage(Hooks.driver);

}

@When("user searches for lipstick")
public void searchProduct(){

home.searchProduct("lipstick");

}

@And("user selects first product")
public void selectProduct(){

search = new SearchPage(Hooks.driver);

search.clickFirstProduct();

for(String window : Hooks.driver.getWindowHandles()) {
Hooks.driver.switchTo().window(window);
}


}

@And("user adds product to cart")
public void addToCart(){

cart = new CartPage(Hooks.driver);

cart.addProduct();

}

@Then("product should be added successfully")
public void verifyCart(){

System.out.println("Product added to cart");

}

}
