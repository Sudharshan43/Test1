package org.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("user is open Adactin Page")
	public void user_is_open_Adactin_Page() {
	  
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	 List<String> asList = dataTable.asList();
	 String string = asList.get(0);
	 String string2 = asList.get(1);
	 System.out.println(string);
	 System.out.println(string2);
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	   
	}


}
