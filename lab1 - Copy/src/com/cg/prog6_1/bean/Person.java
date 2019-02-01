package com.cg.prog6_1.bean;

public class Person {
	private String first_name, last_name, gender;
	Person()
	{
		System.out.println("default constroctor");
	}
    public Person(String fname, String lname, String gen)
	{
		first_name=fname;
		last_name=lname;
		gender=gen;
	}
	public void setfirstname(String fname)
	{
		first_name=fname;
	}
	public String getfirstname()
	{
		return first_name;
	}
	public void setlastname(String lname)
	{
		last_name=lname;
	}
	public String getlastname()
	{
		return last_name;
	}
	public void setgender(String gen)
	{
		gender=gen;
	}
	public String getgender()
	{
		return gender;
	}
	}

