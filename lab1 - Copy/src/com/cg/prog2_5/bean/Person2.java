package com.cg.prog2_5.bean;

public class Person2 {
	private String first_name, last_name;
	private Gender gender;
	Person2()
	{
		System.out.println("default constroctor");
	}
	Person2(String fname, String lname, Gender gender)
	{
		first_name=fname;
		last_name=lname;
		this.gender=gender;
		
	}
	public Gender getGender() {
		return gender;
		}
	public void setGender(Gender gender) {
		this.gender = gender;
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
	}