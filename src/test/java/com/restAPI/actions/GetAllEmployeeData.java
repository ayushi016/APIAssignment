package com.restAPI.actions;

import org.testng.Assert;

import com.restAPI.utility.GetAPIResponse;

import io.restassured.response.Response;


public class GetAllEmployeeData {
    
	public static void getEmployeeData() {
		
		String route = "/employees";
		Response response = GetAPIResponse.getRequest(route);		
		Assert.assertEquals(response.getStatusCode(),200);
	    System.out.println(response.asString());	 

	}
	
}
