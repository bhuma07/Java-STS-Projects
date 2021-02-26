package com.bhumabrave.friend.bean;

public class Friend {

	int id;
	String name;
	String relation;
	String location;

	public Friend() {
	}

	public Friend(int id, String name, String relation, String location) {
		super();
		this.id = id;
		this.name = name;
		this.relation = relation;
		this.location = location;
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
