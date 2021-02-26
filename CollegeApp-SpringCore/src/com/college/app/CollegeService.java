package com.college.app;

//@Service
public class CollegeService implements CollegeServiceInterface {

	public void generateMail(String fName, String lName) {
		String genMail = fName + "." + lName + "@lbrce.com";
		System.out.println("generaated Mail" + genMail);

		CollegeDAO dao = new CollegeDAO();
		dao.generateRegNumber();
	}

}
