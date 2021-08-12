package com.sonata2;

public class Student {
	int stdId;
	String stdName;
	int stdClass;
	Student() {}
	Student(int id, String name,int Class){
		this.stdId=id;
		this.stdName=name;
		this.stdClass=Class;
	}
	public void display() {
		System.out.println("Student Details: ");
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);
	}

	public static void main(String[] args) {
		Student s1= new Student(234,"ABC",9);
		s1.display();

		Student s2= new Student(345,"XYZ",6);
		s2.display();


	}

}
