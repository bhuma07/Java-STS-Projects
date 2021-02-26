package com.college.app;

import org.springframework.stereotype.Service;

@Service
public class CollegeHyphanService  implements CollegeServiceInterface{

	@Override
	public void generateMail(String fName, String lName) {
		String genMail = fName + "-" + lName + "@lbrce.com";
		System.out.println("generaated Mail" + genMail);

		CollegeDAO dao = new CollegeDAO();
		dao.generateRegNumber();
	}


}
