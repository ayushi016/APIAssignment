package com.qait.actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qait.utility.GetAPIResponse;
import io.restassured.response.Response;


public class GetAllEmployeeData {
    
	@Test
	public static void getEmployeeData() {
		
		String route = "/employees";
		Response response = new GetAPIResponse().getRequest(route);		
		Assert.assertEquals(response.getStatusCode(),200);
	    System.out.println(response.asString());
		 
		 
		 
	}
	
}
