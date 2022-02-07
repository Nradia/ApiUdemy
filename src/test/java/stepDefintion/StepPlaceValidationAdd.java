package stepDefintion;

import java.util.ArrayList;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo2.AddPlace12;
import pojo2.Location;
import resources.TestDataBuild;
import resources.Utils;

public class StepPlaceValidationAdd extends Utils {

	 RequestSpecification req;
	 ResponseSpecification resspec;
	 Response response;
	TestDataBuild dta=new TestDataBuild();


	

	@Given("I Add place payload")
	public void i_add_place_payload() {
		
		// we will remove req because it is common across TC we put it in util calss
		
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		//req=given().log().all().spec(reqSpecific())
				//.body(dta.AddPlacePayLoad());
	}

	@When("user calls\"AddApiPlace\" with post https")
	public void user_calls_add_api_place_with_post_https() {
	   
	}

	@Then("Api call is succesful with status code {int}")
	public void api_call_is_succesful_with_status_code(Integer int1) {
	   
	}

	@And("{string} in response body is OK")
	public void in_response_body_is_ok(String string) {
	    
	  
	}

	@And("{string} inn response body is\" App\"")
	public void inn_response_body_is_app(String string) {
	
	}

	
	
}
