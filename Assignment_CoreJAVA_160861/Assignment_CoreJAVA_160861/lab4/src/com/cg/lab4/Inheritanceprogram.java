package com.cg.lab4;

public class Inheritanceprogram {

	
	class Account {
		  double balance;
		  boolean withdraw(double bal){
		    this.balance = this.balance - bal;
		    return true;
		  }
		}

		class SavingAccount extends Account{
		    
		    SavingAccount(){
		        
		    }
		    
		    SavingAccount(double bal){
		        s.balance += bal;
		    }
		    
		    Account s = new Account();
		    
		    final double minBalance = 500;
		    
		    @Override
		    public boolean withdraw(double bal){
		        if(s.balance - bal >= 500){
		            s.balance -= bal;
		            return true;
		        }
		        else
		            return false;
		    }
		}

		class CurrentAccount extends Account{
		    
		    CurrentAccount(){
		        
		    }
		    
		    CurrentAccount(double bal){
		        c.balance += bal;
		    }
		    
		    Account c = new Account();
		    
		    double OverDraftLimit = -2000;
		    
		    @Override
		    public boolean withdraw(double bal){
		        if(c.balance - bal >= -2000){
		            c.balance -= bal;
		            return true;
		        }
		        else
		            return false;
		    }
		    
		}

}
