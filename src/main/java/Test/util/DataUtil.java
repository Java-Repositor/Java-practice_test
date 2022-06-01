package Test.util;

import java.util.ArrayList;
import java.util.List;

import Test.model.EmployeeModel;

public class DataUtil {

	
	/**
	 * 
	 * Data build function to return the employee data
	 */
	
	public static List<EmployeeModel> getEmployeeList() {

		List<EmployeeModel> data = new ArrayList<EmployeeModel>();
		data.add(new EmployeeModel("Andrew", 1001, 25, 28500.0, "male"));
		data.add(new EmployeeModel("Santhosh", 1002, 30, 18500.0, "male"));
		data.add(new EmployeeModel("Abinaya", 1003, 34, 20500.0, "female"));
		data.add(new EmployeeModel("Harini", 1004, 23, 38500.0, "female"));
		data.add(new EmployeeModel("Logesh", 1005, 26, 23500.0, "male"));
		data.add(new EmployeeModel("Pavi", 1006, 38, 48500.0, "female"));
		data.add(new EmployeeModel("Mohan", 1007, 22, 18500.0, "male"));

		return data;
	}

}
