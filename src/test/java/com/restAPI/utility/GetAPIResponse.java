package com.restAPI.utility;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAPIResponse {

	static String baseURL = "http://dummy.restapiexample.com/api/v1/";
	
	public GetAPIResponse() {
		
		SetAPIUrl.SetUrl(baseURL);
	}
	public static  Response getRequest(String route ) {
		
			Response response = RestAssured.given().get(route);		
			return response;
	}
	
	public static  Response postRequest(String route, String requestBody) {
		Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(route);
		return response;
		
	}
	
	public  static Response updateRequest(String route, String requestBody) {
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.put(route);
		return response;
		
	}
	
	public  static Response deleteRequest(String route) {
		
		Response response = RestAssured.given().header("Content-Type", "application/json").delete(route);
		return response;
		
	}

}
