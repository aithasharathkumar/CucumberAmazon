package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestAmazon  {

	@Given("I am on the amazon webpage")
	public void i_am_on_the_amazon_webpage() {
		System.out.println("Yes, user is on the main page");
	}

	@Then("I clicked on mobile")
	public void i_clicked_on_mobile() {
		AmazonHooks.driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[5]")).click();	
	}

	@Then("I clicked on apple")
	public void i_clicked_on_apple() {
		AmazonHooks.driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	}

	@Then("I clicked on iphone13")
	public void i_clicked_on_iphone13() {
		AmazonHooks.driver.findElement(By.xpath("//img[@alt='Apple iPhone 13 (128GB) - Starlight']")).click();
	}
	
	
}