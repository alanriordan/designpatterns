package com.pluralsight.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employeeFromDb = new EmployeeDb("1234", "John", "Wich", "JohWich@hotmail.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "solo", "han", "han@hotmail.com");
		
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		employees.add(employeeFromDb);
		
		EmployeeCSV csv = new EmployeeCSV("12, Sherlock, Homes, homes@sherlok.com");
		employees.add(new EmployeeAdapterCsv(csv));
		return employees;
	}

}
