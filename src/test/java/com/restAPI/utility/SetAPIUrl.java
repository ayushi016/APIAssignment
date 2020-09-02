package com.restAPI.utility;

import io.restassured.RestAssured;

public class SetAPIUrl {

	public static String SetUrl(String url)
{
		return RestAssured.baseURI = url;
		
		}
}
