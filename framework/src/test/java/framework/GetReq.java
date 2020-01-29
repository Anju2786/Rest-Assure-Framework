package framework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetReq {
	@Test
	public void getTest() {
		Response response=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		//get response headers
		System.out.println(response.getHeaders());
		//get response body
		System.out.println(response.getBody().prettyPrint());
		//get response status code
		System.out.println(response.getStatusCode());
		//get response content type
		System.out.println(response.getContentType());
		//get time taken to get a response
		System.out.println(response.getTime());
	}

}
