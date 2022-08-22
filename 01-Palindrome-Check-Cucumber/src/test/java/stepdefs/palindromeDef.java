package stepdefs;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class palindromeDef {

	String input;
	String rvs = "";
	String check;

	@Given("input a word {string}")
	public void input_a_word(String string) {
		this.input = string;
	}

	@When("check the palindrome")
	public void check_the_palindrome() {
		for (int i = (input.length() - 1); i >= 0; i--) {
			rvs = rvs + input.charAt(i);
		}
		if(input.toLowerCase().equals(rvs.toLowerCase())){
			check="Palindrome";
		}else {
			check="Not Palindrome";
		}
	}

	@Then("check result {string}")
	public void check_result(String string) {
		Assert.assertEquals(check, string);
	}

}
