package com.javaex.extendsex;

public class PersonApp {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		Student student2 = new Student("이효리", 40, "제주고");
		
		student1.setName("이정재");
		student1.setAge(44);
		student1.setSchoolName("서울고");
		
		student1.showInfo();
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		student2.showInfo();
		
		
		
	}

}
