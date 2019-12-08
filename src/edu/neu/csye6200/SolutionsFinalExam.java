package edu.neu.csye6200;

import java.util.List;

import API.AbstractSchoolAPI;

public class SolutionsFinalExam {
	public void solutionNeu()
	{
	 AbstractSchoolAPI neu = new NEU();
	 neu.add(new Employee("1,Dan,Peters,17,45.65"));
	 neu.add(new Employee("2,Kal,Bugrara,19,35.70"));
	 neu.add(new Employee("3,Yusuf,Ozbek,18,40.25"));
	 neu.add(new Employee("4,Jane,Smith,16,50.35"));
	 StudentFactory sf = new StudentFactory();
	 neu.add(sf.getObject("1,Don,Smith,17,3.5"));
	 neu.add(sf.getObject("2,Adam,West,19,3.75"));
	 neu.add(sf.getObject("3,Sarah,Alan,18,3.25"));
	 neu.show();
	 neu.sortEmployees();
	 neu.sortRoster();
	 neu.showEmployees();
	 neu.showRoster();
	 
	}
	public void universityModel()
	{
		
	}
	public void objectOrientedDesignConcepts() {
	}

	public void controllingThreads() {
		// TODO Auto-generated method stub
		TwoThread tw= new TwoThread();
		tw.threadDemo();
		
	}
	public void showAnswer(List<?> list)
	{
		      for (Object elem: list) 
		          System.out.print(elem + " ");
		      System.out.println(); 

	}
}
