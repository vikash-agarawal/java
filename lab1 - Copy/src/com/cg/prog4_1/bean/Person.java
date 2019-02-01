package com.cg.prog4_1.bean;

public class Person {
	private String name;
	private float age;

	public Person(String name, float age,int x, int i, Person p1) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
