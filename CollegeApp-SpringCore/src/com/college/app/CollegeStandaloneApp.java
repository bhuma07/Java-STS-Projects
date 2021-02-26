package com.college.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeStandaloneApp {

	public static void main(String[] args) {

		System.out.println(" College App- Student Creation");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your firstname");
		String firstName = scan.nextLine();

		System.out.println("Enter your Lastname");
		String lastName = scan.nextLine();

		//CollegeController concntl = new CollegeController();
		
		ApplicationContext appcContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
		CollegeController cc=appcContext.getBean(CollegeController.class);
		cc.fetchValues(firstName, lastName);

	}

}
