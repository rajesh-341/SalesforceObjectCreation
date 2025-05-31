package APITesting;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthValidation extends NameValidation {

	@Test
	public void RequestTest1()
	{
		
		Response LoginResponse = RestAssured
				.given()
						.baseUri("https://login.salesforce.com")
						.header("Content-Type", "application/x-www-form-urlencoded")
						.formParam("grant_type", "password")
						.formParam("client_id", "LYw21qJlZw0LNaTPKKfvTxD8iLBN0gv1Hn48lJ9V6Ya4V1lWsl1GnI\r\n")
			            .formParam("client_secret", "D86CC29D56C666D4DE22E097172A2A1")
						.formParam("username", "test@gmail.com")
						.formParam("password", "test@123420l7d73tK")
				.when()
						.post("/services/oauth2/token")
				.then()
						.log().all().statusCode(200).extract().response();
	
		String ResResponse = LoginResponse.getBody().asString();
		System.out.println(LoginResponse.statusCode() + ResResponse);
		String token = LoginResponse.jsonPath().getString("access_token");
		
		ExtractResponse(token);		
	}
}
