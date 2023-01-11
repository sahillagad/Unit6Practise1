package com.masai.dao;

public class Skill {

	private int id;
	private String name;
	private double yearsOfExperience;
	public Skill(int id, String name, double yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
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
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	
	
}
