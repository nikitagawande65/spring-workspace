package com.myapp.spring.domain;

public class Student {
	private String name;
	private int age;
	private String dept;
	
	
	public Student() {
		
	}
	public Student(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}
	
	

}
