package com.qait.actions;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qait.utility.GetAPIResponse;
import io.restassured.response.Response;

public class CreateEmployee {
	
	static Response response=null;
	
	public CreateEmployee() {
		
		String name = "abc", salary = "11223";
		int age = 30;
		String route = "/create";
		 String requestBody = "{"   +
		            "  \"name\":\""   + name + "\"," +
		            "  \"salary\":\"" + salary + "\"," +
		            "  \"age\":\""    +age + "\"" +
		            "}";
	    response = new GetAPIResponse().postRequest(route,requestBody);
	    Assert.assertEquals(response.getStatusCode(),200);
	    System.out.println("employeee created--->>>"+response.asString());
}
	
	@Test
	public int getCreatedEmployeeID() {
		
		String responseBody = response.getBody().asString();
		JSONObject list = new JSONObject(responseBody);
		int id = list.getJSONObject("data").getInt("id");
		System.out.println("employee ID ---->"+id);
		return id;
		
	}
}