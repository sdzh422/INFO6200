package edu.neu.csye6200;

public class FinalExam {
	
	/**
	 * Create and control TWO thread to alternate output of the alphabet (lowercase and uppercase).
	 */
	public void controllingThreads() {
		/**
		 * Design and instantiate your own SolutionFinalExam class
		 * containing all programming solutions.
		 */
		SolutionsFinalExam answers = new SolutionsFinalExam();
		answers.controllingThreads();
	}
	
	/**
	 * Generic Programming: showAnswers method and OOD Concepts Strings
	 */
	public void objectOrientedDesignConcepts() {
		/**
		 * Design and instantiate your own SolutionFinalExam class
		 * containing all programming solutions.
		 */
		SolutionsFinalExam answers = new SolutionsFinalExam();
		answers.objectOrientedDesignConcepts();
	}
	
	/**
	 * Northeastern University model
	 * 
	 * Hire Employees, sort Employees, scale WAGES of all Employees;
	 * Enroll Students, sort Students, scale GPA of all Students;
	 * 
	 * 1. Design AbstractPersonAPI abstract class with 
	 * 	  AT LEAST the following abstract methods:
	 * 
    Integer getId();
	setId(Integer id);
	String getFirstName();
	void setFirstName(String firstName);
	String getLastName();
	void setLastName(String lastName);
	Integer getAge();
	void setAge(Integer age);
	void show();
	 * 
	 * 2. Design Person class derived from AbstractPersonAPI
	 * 3. Design AbstractEmployeeAPI abstract class derived from Person with 
	 *    AT LEAST the following abstract methods:
	 *    
	Double getWage();
	void setWage(Double wage);
	 *
	 * 4. Design Employee class derived from AbstractEmployeeAPI
	 * 
	 *    *** 5 POINTS FOR REQUREMENTS 1 to 4 ***
	 * 
	 * 
	 * 5. Design AbstractStudentAPI interface with 
	 *    AT LEAST the following abstract methods:
	 *    
	public abstract Double getGpa();
	public abstract void setGpa(Double gpa);
	 * 
	 * 6. Design a Student class derived from Person, 
	 * 	  overload toString method and Implement AbstractStudentAPI
	 * 
	 * 7. Design AbstractPersonFactoryAPI with ONLY the following methods:
	 * 
	public abstract AbstractPersonAPI getObject();
	public abstract AbstractPersonAPI getObject(String csvData);
	 * 
	 * 
	 * 8. Design StudentFactory derived from AbstractPersonFactoryAPI
	 * 
	public abstract AbstractPersonAPI getObject();
	public abstract AbstractPersonAPI getObject(String csvData);
	 * 
	 *    *** 10 POINTS FOR ABOVE REQUREMENTS 5 to 8 ***
	 * 	
	 * 
	 * 9. Design School class derived from the supplied AbstractSchoolAPI
	 *    and Design NEU class derived from AbstractSchoolAPI
	 *    *** 10 POINTS FOR ABOVE REQUREMENT 9 ***
	 * 
	 * 
	 * 
	 * 10. Instantiate an neu object from the NEU class and perform the following:
	 * 	  a. Hire several Employees using the AbstractSchoolAPI add method. 
	 * 		 and the following Strings (PARSE CSV STRINGS WITHOUT USING FILE I/O):
	 *       *** 5 POINTS FOR ABOVE REQUREMENT 10a ***
	 * 
"1,Dan,Peters,17,45.65"
"2,Kal,Bugrara,19,35.70"
"3,Yusuf,Ozbek,18,40.25"
"4,Jane,Smith,16,50.35"
	 * 
	 * 	  b. Enroll several Students using the StudentFactory and the AbstractSchoolAPI add method
	 * 		 and the following Strings (PARSE CSV STRINGS WITHOUT USING FILE I/O)::
	 *       *** 5 POINTS FOR ABOVE REQUREMENT 10b ***
	 * 
"1,Don,Smith,17,3.5"
"2,Adam,West,19,3.75"
"3,Sarah,Alan,18,3.25"
	 * 
	 *    c. Show the state of the neu object using the AbstractSchoolAPI show method.
	 *    d. Sort all Employees in Natural Order (last name) using the AbstractSchoolAPI sortEmployees method.
	 *    e. Sort all Students in Natural Order (last name) using the AbstractSchoolAPI sortRoster method.
	 *       *** 5 POINTS FOR REQUIREMENTS c,d,e ***
	 *    
	 *    f. USE STREAM API to Sort all Employees BY WAGE (hi to low) using the AbstractSchoolAPI sortEmployees method.
	 *    g. USE STREAM API to Scale and Sort all Employees BY WAGE (low to hi) 
	 *       AND INCREASED BY 100 using the AbstractSchoolAPI scaleEmployees method.
	 *       *** 5 POINTS FOR REQUIREMENTS f,g ***
	 *       
	 *    h. USE STREAM API to Sort all Students BY GPA (hi to low) using the AbstractSchoolAPI sortRoster method.
	 *    i. USE STREAM API to Scale and Sort all Students BY GPA (low to hi) 
	 *       AND INCREASED BY 100 using the AbstractSchoolAPI scaleRoster method.
	 *       *** 5 POINTS FOR REQUIREMENTS h,i ***
	 *       
	 */
	public void universityModel() {
		/**
		 * Design and instantiate your own SolutionFinalExam class
		 * containing all programming solutions.
		 */
		SolutionsFinalExam answers = new SolutionsFinalExam();
		answers.universityModel();
	}
	
	public static void demo() {
		System.out.println("\n\t" + FinalExam.class.getName() + ".demo()...");
		FinalExam obj = new FinalExam();
		
		/**
		 * NOTE: 10 POINTS for correct, executable, on-time submission of a zipped Eclipse workspace
		 * in the correct format,
		 * FOR EXAMPLE: 
		 * 
		 * 		workspace_dan_peters_photon_neu.zip:
		 * 
		 * NOTE: all CONSOLE OUTPUT must be pasted into the end of the Driver class main method as a comment.
		 */ 
		
		/**
		 * 15 POINTS: Controlling Threads:
		 * 
		 * Create TWO threads, where each thread outputs the ENTIRE alphabet,
		 * Thread 1, lowerCase outputs abcdefghijklmnopqrstuvwxyz
		 * Thread 2, lowerCase outputs ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 * HOWEVER,
		 * YOU MUST Control the TWO threads so they ALTERNATE output,
		 * aAbBcC ...xXyYzZ
		 */
		System.out.println("\n\t 15 POINTS: Controlling Alphabet Output Threads:");
		obj.controllingThreads();
		
		/**
		 * 10 POINTS: Generic Programming:
		 * 
		 * 1. Design 'showAnswers' using Generic programming to allow 
		 * 	  the 'showAnswers' method to output the entire contents of any
		 *    sequential container to standard output as Console Output:
		 *    (whether container contains EITHER String, Double, Integer, etc. elements)
		 *   
		 *  USING 'showAnswers:
		 *  2. output the following list of integer values: 1 2 3 4 5
		 *  3. output the following list of floating point values: 1.1 2.2 3.3 4.4 5.5
		 *  4. output the following list of character: a b c d e
		 *  5. output a List of Strings, each of which is an important Object Oriented Design concept.
		 */
		System.out.println("\n\n\t 10 POINTS: Generic showAnswers Important Object Oriented Concepts:");
		obj.objectOrientedDesignConcepts();

		/**
		 * 50 POINTS: University Model
		 * Design a model of Northeastern University
		 */
		System.out.println("\n\n\t 50 POINTS: University Model:");
		obj.universityModel();
		
		System.out.println("\n\t" + FinalExam.class.getName() + ".demo()... done!");
	}

}
