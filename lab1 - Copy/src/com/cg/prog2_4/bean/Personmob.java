package com.cg.prog2_4.bean;

public class Personmob {
	private String first_name, last_name, gender,mob;
	Personmob()
	{
		System.out.println("default constroctor");
	}
	Personmob(String fname, String lname, String gen, String mob)
	{
		first_name=fname;
		last_name=lname;
		gender=gen;
		this.mob=mob;
	}
	public String getMobile() {
		return mob;
	}
	public void setMobile(String mob) {
		this.mob = mob;
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
	public void print() {
		System.out.println("first name :"+first_name);
		System.out.println("last name :"+last_name);
		System.out.println("gender :"+gender);
		System.out.println("mobile :"+mob);
	}
}