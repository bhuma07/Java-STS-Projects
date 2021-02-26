package com.spring.config.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	
	List<String> getColleges(){
		
		List<String> Colleges = new ArrayList<String>();
		Colleges.add("Lbr college of engineering");
		Colleges.add("satyabhama college of engineering");
		Colleges.add("vit college of engineering");
		return Colleges;
		
	}
	public static void main(String[] args) {
		CollegeController cc = new CollegeController();
		System.out.println(cc.getColleges());
	}

}
