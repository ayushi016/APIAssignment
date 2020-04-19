package com.qait.utility;

import org.testng.annotations.Test;

import com.qait.actions.*;

public class BaseClass {

	@Test
	public void base() {
		GetAllEmployeeData.getEmployeeData();
		int id = new CreateEmployee().getCreatedEmployeeID();
		id = 3;
		GetSpecificEmployeeData.get(id);
		UpdateEmployeeData.updateEmployeeDetails(id);
		DeleteEmployee.delete(id);
		
		
	}
}
