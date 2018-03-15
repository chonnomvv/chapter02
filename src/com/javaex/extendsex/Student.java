package com.javaex.extendsex;

public class Student extends Person{
	private String schoolName;

	public Student() {}
	
	public Student(String name, int age, String schoolName) {
		super.name = name;
		super.age = age;
		this.schoolName = schoolName; 
	}
//	public Student(String name, int age, String schoolName) {
//		this.name = name;
//		this.age = age;
//		this.schoolName = schoolName;
//		
//	}
//	
//	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	public void showInfo() {
//		super.showInfo();
		
		System.out.println("Name: 한글" + name);
		System.out.println("Age: " + age);
		System.out.println("School Name: " + schoolName);
		System.out.println("===========================");
	}
	

}
