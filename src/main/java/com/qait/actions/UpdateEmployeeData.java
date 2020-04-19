package com.qait.actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.utility.GetAPIResponse;

import io.restassured.response.Response;

public class UpdateEmployeeData {

	@Test
	public static void updateEmployeeDetails(int id) {
	
		String name = "abcghjvjg", salary = "11223000";
		String age = "300";
		String route = "/update/"+id;
		
		 String requestBody = "{"   +
		            "  \"name\":\""   + name + "\"," +
		            "  \"salary\":\"" + salary + "\"," +
		            "  \"age\":\""    +age + "\"" +
		            "}";
		Response response = new GetAPIResponse().updateRequest(route,requestBody);
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println("updated-----------"+response.asString());
	}
}
