package com.bhumabrave.Springboot.soap.bean;

public class Course {

	private int id;
	private String name;
	private String decription;

	public Course(int id, String name, String decription) {
		super();
		this.id = id;
		this.name = name;
		this.decription = decription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", decription=" + decription + "]";
	}

}
