package com.cg.abstractclass;


public class AbsMethods {
	abstract class Account { // for Account class
		String nameA = "";
		float ageA = 0;
		long accNum = 123;
		double balance = 0;
	    
	    Account(){
	        
	    }
	    
	    Account(String name, float age, double balance){
	        setNameA(name);
	        setAgeA(age);
	        this.balance = balance;
	    }
	        
		public void deposit(double rupees) {
			balance += rupees;
		}

		public abstract void withdraw(double rupees);

		public String toString() {
			// Should return the string in the format:
			// Name: TempName Age: 68.0 AccNumber: 1333339438704 Balance= 899.0
			return "Name: " + getNameA() + " Age: " + getAgeA() + " AccNumber: "
					+ accNum + " Balance= " + balance;
		}

		public String getNameA() {
			return nameA;
		}

		public void setNameA(String nameA) {
			this.nameA = nameA;
		}

		public float getAgeA() {
			return ageA;
		}

		public void setAgeA(float ageA) {
			this.ageA = ageA;
		}

		public double getBalance() {
			// Should return the balance present in the Account
			return balance;
		}

		public void setBalance(double bal) {
			// Set the balance for the account holder
			balance = bal;
		}

		public void setAccountDetails(String name, float age, double balance) {
			// Set the account details for the account holder
			setNameA(name);
			setAgeA(age);
			this.balance = balance;
		}

		public Person getPerson() {
			// return the AccountHolder
			Person p = new Person();
			return p;
		}
	}

	class Person extends Account { // B for Person class

		public Person(String string, float i, double j) {
			// TODO Auto-generated constructor stub
			setNameA(string);
			setAgeA(i);
			setBalance(j);
		}

		public Person() {
			// TODO Auto-generated constructor stub
		}

		String name = "";
		float age = 0;

		@Override
		public void withdraw(double rupees) {
			// TODO Auto-generated method stub
			if (getBalance() - rupees >= 500) {
				setBalance(getBalance() - rupees);
			}

		}

	}
}
