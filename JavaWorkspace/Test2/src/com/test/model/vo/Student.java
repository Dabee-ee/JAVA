package com.test.model.vo;

public class Student extends Person {
	
	private String stuNo;
	private String major;
	
	public void Student () {};
	
	public Student(String name, int age, int height, int weight, String stuNo, String major) {
		super(name, age, height, weight);
		this.stuNo = stuNo;
		this.major = major;
	}

	 public String toString() {

	        return super.toString() + "\t\t" + stuNo + "\t\t" + major;

	    }

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	

}
