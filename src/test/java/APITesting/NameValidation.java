package APITesting;

import static org.testng.Assert.assertTrue;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class NameValidation {
	
	public void ExtractResponse(String token) 
	{
		Response res = RestAssured
				.given().baseUri("https://omnicloud-dev-ed.develop.my.salesforce.com")
						.header("Authorization","Bearer" + token)
				.when().get("/services/data/v59.0/query/?q=SELECT+Id,Name+FROM+Account+Phone")
				.then().statusCode(200).extract().response();
			
		 JsonPath jsonPath = res.jsonPath();
	     List<String> names = jsonPath.getList("records.Name");
	     assertTrue(names.contains("Acme Corporation"), "Account name not found!");
		
		String Response = res.getBody().asString();
		long RequestTime = res.getTime();
		int stCode = res.statusCode();
		
		System.out.println("Response =" + Response + "RequestTime =" + RequestTime + "stCode = " + stCode);
	}
}
