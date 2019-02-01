package com.cg.prog4_2.bean;

public class Saving extends Account {
	final int minimumbalance=1000;
	 Saving(int balance)
	{
		super(balance);
	}
	public boolean withdraw(int balance)
	{
		if(super.balance>minimumbalance)
		{
			System.out.println("withdraw possible");
			super.balance-=balance;
			return true;
		}
		return false;
	}
}