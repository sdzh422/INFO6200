package edu.neu.csye6200;

import API.AbstractStudentAPI;

public class Student extends Person implements AbstractStudentAPI{
	private Double gpa;
	public Student(String stu)
	{
		String[] temp = stu.split(",");
		super.setId(Integer.valueOf(temp[0]));
		super.setFirstName(temp[1]);
		super.setLastname(temp[2]);
		super.setAge(Integer.valueOf(temp[3]));
		setGpa(Double.valueOf(temp[4]));
	}
	
	@Override
	public Double getGpa() {
		// TODO Auto-generated method stub
		return gpa;
	}

	@Override
	public void setGpa(Double gpa) {
		this.gpa = gpa;
		
	}
	@Override
	public String toString()
	{
		return super.getLastname();
	}

}
