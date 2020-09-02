package com.restAPI.actions;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.restAPI.utility.GetAPIResponse;

import io.restassured.response.Response;

public class UpdateEmployeeData {


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
//		AssertJUnit.assertEquals(response.getStatusCode(),200);
		System.out.println("updated-----------"+response.asString());
	}
}
