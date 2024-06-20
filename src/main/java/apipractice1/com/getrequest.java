package apipractice1.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getrequest {
	
	@Test
	public static void main() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification req = RestAssured.given();
		req.pathParam("user", "2");
		req.header("Content-Type","application/json");
		
		Response res=req.when().get("api/users/{user}");
		
		res.then().log().all();
		
		int statuscode =res.statusCode();
		System.out.println(statuscode);
		
		String body =res.getBody().asString();
		
		System.out.println(body);
	}

}
