package edu.neu.csye6200;

import API.AbstractPersonAPI;
import API.AbstractPersonFactoryAPI;

public class StudentFactory extends AbstractPersonFactoryAPI{

	@Override
	public AbstractPersonAPI getObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractPersonAPI getObject(String csvData) {
		// TODO Auto-generated method stub
		return new Student(csvData);
	}

}
