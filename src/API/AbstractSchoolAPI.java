package API;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * API for School
 * @author danielgmp
 *
 */
public abstract class AbstractSchoolAPI {
	/**
	 * Enroll a student
	 * 
	 * @param student		Student to enroll 
	 */
	public abstract void add(AbstractPersonAPI student);
	/**
	 * Enroll an entire graduating class of students (e.g. Class of 2020)
	 * 
	 * @param student		Student to enroll 
	 */
	public abstract void add(List<AbstractPersonAPI> students);
	
	/**
	 * Hire an Employee
	 * 
	 * @param employee		Employee to hire 
	 */
	public abstract void add(AbstractEmployeeAPI employee);
	
	/**
	 * Show the state of the school:
	 * 1. Employees employed
	 * 2. Students enrolled
	 */
	public abstract void show();
	
	public abstract void sortEmployees();	// sort NATURAL ORDER
	public abstract void sortEmployees(Comparator<AbstractEmployeeAPI> c, String title);
	public abstract void scaleEmployee(Comparator<AbstractEmployeeAPI> c, Function<AbstractEmployeeAPI, AbstractEmployeeAPI> f, String title);
	
	public abstract void clearEmployees();
	public abstract void showEmployees();
	
	public abstract void sortRoster();		// sort NATURAL ORDER
	public abstract void sortRoster(Comparator<AbstractPersonAPI> c, String title);
	public abstract void scaleRoster(Comparator<AbstractPersonAPI> c, Function<AbstractPersonAPI, AbstractPersonAPI> f, String title);
	
	public abstract void clearRoster();
	public abstract void showRoster();

}
