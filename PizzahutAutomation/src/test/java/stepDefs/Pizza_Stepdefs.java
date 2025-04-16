package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pizza_Stepdefs {

	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.pizzahut.co.in/");
	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String CityName) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		WebElement Location = driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Location);
		Location.sendKeys(CityName);
		Location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Location.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I should land on the Deals page with page url {string}")
	public void i_should_land_on_the_Deals_page_with_page_url(String DealsURL) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(DealsURL, CurrentURL);
	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String PizzaTab) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Pizza = driver
				.findElement(By.xpath("//a[@href='/order/pizzas/' and @data-synth='link--pizzas--side' ]/span"));
		Pizza.click();
	}

	@Then("I add {string} to the basket")
	public void i_add_to_the_basket(String PizzaName) {
		// Write code here that turns the phrase above into concrete actions
		WebElement SelectPizza = driver.findElement(
				By.xpath("//button[@data-synth='button--kadhai-paneer-recommended-pan-personal--one-tap']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectPizza);
		SelectPizza.click();
	}

	@Then("I note down the price displayed on the screen")
	public void i_note_down_the_price_displayed_on_the_screen() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Price = driver.findElement(By.xpath("//span[@class='w-auto ml-3']"));
		System.out.println("The price of Kadhai Paneer is " + Price.getText());
	}

	@Then("I should see the pizza {string} is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart(String expctedResult) {
		// Write code here that turns the phrase above into concrete actions
		WebElement ItemInCart = driver.findElement(By.xpath("//div[text()='Personal Kadhai Paneer']"));
		String ACtualResult = ItemInCart.getText();
		Assert.assertEquals(expctedResult, ACtualResult);
		System.out.println("The Expected Result is" + expctedResult);
		System.out.println("The Actual Result is" + ACtualResult);
	}

	@Then("price is also displayed correctly")
	public void price_is_also_displayed_correctly() {
		// Write code here that turns the phrase above into concrete actions
		WebElement PriceInCart = driver.findElement(By.xpath("//div[@class='basket-item-product-price leading-tight bold text-15 text-black']"));
		System.out.println("The Prince of Pizza in cart is" + PriceInCart.getText());
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		WebElement Checkout = driver.findElement(By.xpath("//span[text()='Checkout']"));
		Checkout.click();
		Thread.sleep(3000);
	}

	@Then("I should be landed on the secured checkout page with url {string}")
	public void i_should_be_landed_on_the_secured_checkout_page_with_url(String ExpectedURL) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String CurrentURL = driver.getCurrentUrl();
		//Assert.assertEquals(ExpectedURL, CurrentURL);
		System.out.println("The Expected Result is" + ExpectedURL);
		System.out.println("The Actual Result is" + CurrentURL);
	}

	@Then("I enter the First Name {string}")
	public void i_enter_the_First_Name(String FirstName) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Name = driver.findElement(By.id("checkout__name"));
		Name.sendKeys(FirstName);
		
	}

	@Then("I enter the Mobile  {string}")
	public void i_enter_the_Mobile(String Mobile) {
		// Write code here that turns the phrase above into concrete actions
		WebElement MobileNumber = driver.findElement(By.id("checkout__phone"));
		MobileNumber.sendKeys(Mobile);
	}

	@Then("I enter the email {string}")
	public void i_enter_the_email(String Email) {
		// Write code here that turns the phrase above into concrete actions
		WebElement EmailAddress = driver.findElement(By.id("checkout__email"));
		EmailAddress.sendKeys(Email);
	}
}
