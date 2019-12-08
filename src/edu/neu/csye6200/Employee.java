package edu.neu.csye6200;

import API.AbstractEmployeeAPI;

public class Employee extends AbstractEmployeeAPI{
	@Override
	
	public Double getWage() {
		return super.wage;
	}

	@Override
	public void setWage(Double wage) {
		super.wage = wage;
	}
	public Employee(String em)
	{
		String temp[] = em.split(",");
		super.setId(Integer.valueOf(temp[0]));
		super.setFirstName(temp[1]);
		super.setLastname(temp[2]);
		super.setAge(Integer.valueOf(temp[3]));
		setWage(Double.valueOf(temp[4]));
	}


}
