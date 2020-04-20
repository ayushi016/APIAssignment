package com.qait.actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.utility.GetAPIResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {

	@Test
	public static void delete(int id) {
	
		String route = "/delete/" + id;
		Response response = new GetAPIResponse().deleteRequest(route);
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println("deleted--->"+response.asString());	
		
//		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete/"+45;
//		Response response = RestAssured.given().delete();
//		System.out.println(response.asString());
	}
}
