package com.spring.config.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

	@RequestMapping("/")
	String hello() {
		System.out.println("running");
		return "index";
	}

	@RequestMapping("/createStudent")
	String createNewStudent(HttpServletRequest req) {
		
		String sId= req.getParameter("studentId");
		int studentIdNumber= Integer.parseInt(sId);
		
		String sfName = req.getParameter("StudentFirstName");
		System.out.println("entered firstName :" + sfName);

		String slName = req.getParameter("StudentLastName");
		System.out.println("entered firstName :" + slName);

		req.setAttribute("nameofstudent", sfName + " " + slName);

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load driver");
		}
		Connection con =null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db", "root", "root");
		} catch (SQLException e) {
			System.out.println("unable to connect db");
		}
		
		Statement stmt;
		try {
			stmt= con.createStatement();
			stmt.execute("insert into student values("+studentIdNumber+",'"+sfName+"','"+slName+"')");
		} catch (SQLException e) {
			System.out.println("unable to create statement");
		} 
		
		System.out.println("connected database");
		return "success";
	}

}
