package com.cg.prog4_2.bean;

public class Current extends Account{
	int overdraftlimit=2000;
	public Current(int balance)
	{
		super(balance);
	}
	public boolean withdraw(int limit)
	{
		if(limit<overdraftlimit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
