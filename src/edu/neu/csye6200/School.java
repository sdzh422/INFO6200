package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import API.AbstractEmployeeAPI;
import API.AbstractPersonAPI;
import API.AbstractSchoolAPI;

public class School extends AbstractSchoolAPI{
	private ArrayList<Student> studentlist;
	private ArrayList<AbstractEmployeeAPI> employeelist;
	public School()
	{
		studentlist = new ArrayList<>();
		employeelist= new ArrayList<>();
	}
	@Override
	public void add(AbstractPersonAPI student) {
		// TODO Auto-generated method stub
		studentlist.add((Student)student);
	}

	@Override
	public void add(List<AbstractPersonAPI> students) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(AbstractEmployeeAPI employee) {
		// TODO Auto-generated method stub
		employeelist.add(employee);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(studentlist.size()+" Students, "+employeelist.size()+" Employees");
	}

	@Override
	public void sortEmployees() {
		// TODO Auto-generated method stub
		employeelist.sort((e1,e2)->e1.getLastname().compareTo(e2.getLastname())  );
		employeelist.stream().sorted((e1,e2)->Double.compare(e1.getWage(),e2.getWage()));
		
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractEmployeeAPI> c, String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scaleEmployee(Comparator<AbstractEmployeeAPI> c, Function<AbstractEmployeeAPI, AbstractEmployeeAPI> f,
			String title) {
		// TODO Auto-generated method stub
		employeelist.stream().sorted((e2,e1)->Double.compare(e1.getWage(),e2.getWage()));
		employeelist.stream().forEach(e->e.setWage(e.wage*100));
	}

	@Override
	public void clearEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showEmployees() {
		// TODO Auto-generated method stub
		for(AbstractEmployeeAPI e:employeelist)
		{
			System.out.print(e.getFirstName()+","+e.getLastname()+","+e.getWage());
		}
		System.out.println();
	}

	@Override
	public void sortRoster() {
		// TODO Auto-generated method stub
		studentlist.sort((s1,s2)->s1.getLastname().compareTo(s2.getLastname()));
		studentlist.stream().sorted((s1,s2)->Double.compare(s1.getGpa(),s2.getGpa()));
		
		
	}

	@Override
	public void sortRoster(Comparator<AbstractPersonAPI> c, String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scaleRoster(Comparator<AbstractPersonAPI> c, Function<AbstractPersonAPI, AbstractPersonAPI> f,
			String title) {
		// TODO Auto-generated method stub
		studentlist.stream().sorted((s2,s1)->Double.compare(s1.getGpa(),s2.getGpa()));
		studentlist.stream().forEach(s->s.setGpa(s.getGpa()*100));
	}

	@Override
	public void clearRoster() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showRoster() {
		for(Student s:studentlist)
		{
			System.out.print(s.getFirstName()+","+s.getLastname()+","+s.getGpa());
		}
		System.out.println();
	}

}
