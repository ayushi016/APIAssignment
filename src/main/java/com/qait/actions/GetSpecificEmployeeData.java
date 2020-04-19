package com.qait.actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qait.utility.GetAPIResponse;
import io.restassured.response.Response;

public class GetSpecificEmployeeData {

	@Test
	public static void get(int id) {

		String route = "/employee/"+ 1;
		Response response = new GetAPIResponse().getRequest(route);
	    Assert.assertEquals(response.getStatusCode(),200);
	    System.out.println("employee data -----..>"+response.asString());
	}
}
