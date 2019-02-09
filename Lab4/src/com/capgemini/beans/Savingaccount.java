package com.capgemini.beans;

public class Savingaccount {
	int over_limit=-5000;
	public boolean withdraw(Account account,int balance)
	{
		if(over_limit>=(account.getBalance()-balance))
			{return false;}
	
	account.setBalance(account.getBalance()-balance);
	return true;
	}

}
