package framework;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test1 extends RestAssureBaseclass {
	
	@Test
	public void getTest() {
		Response res=ApiMethod.executeRequest("getOneEmployee",REQ_PARA_FILLE_PATH,REQ_PARA_SHEET);
		System.out.println(res.prettyPrint());
	}
	
	@Test
	public void postTest() {
		//Response res=ApiMethod.executeRequest("createEmployee", REQ_PARA_FILLE_PATH,REQ_PARA_SHEET);
	
	}
	}
	

 