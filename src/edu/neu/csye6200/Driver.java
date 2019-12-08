package edu.neu.csye6200;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Driver {
	public  static void main(String[] args)
	{
		SolutionsFinalExam sfe= new SolutionsFinalExam();
		sfe.solutionNeu();
		sfe.controllingThreads();
		/*
3 Students, 4 Employees
Kal,Bugrara,35.7Yusuf,Ozbek,40.25Dan,Peters,45.65Jane,Smith,50.35
Sarah,Alan,3.25Don,Smith,3.5Adam,West,3.75
1 2 
e f 
aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ

		 */

		ArrayList<String> s = new ArrayList<>();
		s.add("e");
		s.add("f");
		ArrayList<Integer> i =new ArrayList<>();
		i.add(1);
		i.add(2);
		sfe.showAnswer(i);
		sfe.showAnswer(s);


				

	}

}
