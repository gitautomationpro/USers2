package com.Qa.Testcases;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Logintest {

	@Given("user on a home page")
	public void user_on_a_home_page() {
	
	}

	@Then("user clicks a on login")
	public void user_clicks_a_on_login(io.cucumber.datatable.DataTable data) {
	
		List<List<String>>li =data.asLists();
		System.out.println(li.get(0).get(0));
		System.out.println(li.get(0).get(1));
		
		
		
	}

	@Then("user enters a id and password")
	public void user_enters_a_id_and_password() {
	  
	}

	@Then("user clicks on a login button")
	public void user_clicks_on_a_login_button() {
	  
	}

	@Then("user successfully a logged in")
	public void user_successfully_a_logged_in() {
	   
	}
	
	
}
