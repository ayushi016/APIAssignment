package com.restAPI.actions;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAPI.utility.GetAPIResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSpecificEmployeeData {

	public static void get(int id) {

//		String route = "/employee/"+ 1;
//		Response response = new GetAPIResponse().getRequest(route);
//	    Assert.assertEquals(response.getStatusCode(),200);
//	    System.out.println("employee data -----..>"+response.asString());
		
		
//		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
		String route="/employee/" + id;
		Response response = GetAPIResponse.getRequest(route);		
//		Assert.assertEquals(response.getStatusCode(),200);
	    System.out.println(response.asString());
		
	}
}
