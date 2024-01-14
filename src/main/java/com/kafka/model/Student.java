package com.kafka.model;

public class Student {

	private int id;
	private String studentNameString;
	private String studentFatherName;
	private String studentMotherName;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String studentNameString, String studentFatherName, String studentMotherName, int age) {
		super();
		this.id = id;
		this.studentNameString = studentNameString;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentNameString() {
		return studentNameString;
	}

	public void setStudentNameString(String studentNameString) {
		this.studentNameString = studentNameString;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentNameString=" + studentNameString + ", studentFatherName="
				+ studentFatherName + ", studentMotherName=" + studentMotherName + ", age=" + age + "]";
	}

}
