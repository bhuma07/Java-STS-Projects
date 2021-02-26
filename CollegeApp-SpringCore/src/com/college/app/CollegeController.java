package com.college.app;

import org.springframework.beans.factory.annotation.Autowired;

public class CollegeController {
	@Autowired
	CollegeServiceInterface service;

	void fetchValues(String stundentFristName, String studentLastName) {
		System.out.println("provided first Name -" + stundentFristName);
		System.out.println("provided first Name -" + studentLastName);

		// CollegeService service = new CollegeService();
		service.generateMail(stundentFristName, studentLastName);
	}

}
