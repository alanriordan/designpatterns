package com.pluralsight.structural.adapter;

public class EmployeeAdapterCsv implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeAdapterCsv(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
