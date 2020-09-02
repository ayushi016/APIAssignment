package com.restAPI.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.restAPI.actions.*;
import com.restAPI.utility.GetAPIResponse;

public class BaseClass {
	
	
	@BeforeClass
	public void setUP() {
		
		GetAPIResponse ins = new GetAPIResponse();
	}

	@Test
	public void base() {
		GetAllEmployeeData.getEmployeeData();
		new CreateEmployee();
		int id = CreateEmployee.getCreatedEmployeeID();
		GetSpecificEmployeeData.get(id);
		UpdateEmployeeData.updateEmployeeDetails(id);
		DeleteEmployee.delete(id);
				
	}
}
