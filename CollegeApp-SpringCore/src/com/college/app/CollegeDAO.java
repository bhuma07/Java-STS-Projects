package com.college.app;

public class CollegeDAO {
	
	void generateRegNumber() {
		
		int genRegCode= (int)Math.random() * 10000;
		System.out.println("Student Roll no"+genRegCode);
		
	}

}
