package model.entities;

import javax.naming.LimitExceededException;

import model.exeptions.BalanceException;
import model.exeptions.LimitExeptions;

public class Account {

	Integer number;
	String 	holder;
	Double 	balance;
	Double 	withDrawLimit;
		
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getnumber() {
		return number;
	}

	public void setnumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	@Override
	public String toString() {
		return "Account []";
	}
	
	public void deposit(Double amount) {
		balance = amount;
	}
	
	public void withDraw(Double amount) throws BalanceException, LimitExeptions {
		if(amount > withDrawLimit) {
			throw new LimitExeptions();
		}
		else if (amount > balance){
			throw new BalanceException();
		}
		balance-=amount;		
	}
	
}
