package hotelrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelDef {
	WebDriver driver;

	@Given("^user is open Adactin open on Chromebrowser$")
	public void user_is_open_Adactin_open_on_Chromebrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^Enter the valid username and password$")
	public void enter_the_valid_username_and_password() throws Exception {
		driver.findElement(By.id("username")).sendKeys("premkumar7264");
		driver.findElement(By.id("password")).sendKeys("Sivavis@4437");
		

	}

	@When("^click the login button$")
	public void click_the_login_button() throws Exception {
		driver.findElement(By.id("login")).click();

	}

	@Then("^user check the homepage visible or not$")
	public void user_check_the_homepage_visible_or_not() throws Exception {
//		System.out.println("Completed");

	}

}
