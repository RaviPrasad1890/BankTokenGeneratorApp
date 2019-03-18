package com.bank.abc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bank.abc.model.Counter;
import com.bank.abc.model.Customer;

public class Customer {

	
	private int custId;
	private String custName;
	private char primaryCustomer;
	private Token token;
	
	
	private String tokenAssigned;
	private String counterAssigned;
	
	public Customer() {
		
	}

	public Customer(int custId, String custName, char primaryCustomer) {
		this.custId = custId;
		this.custName = custName;
		this.primaryCustomer = primaryCustomer;
		//this.tokenAssigned = tokenAssigned;
	}

	
	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public char getPrimaryCustomer() {
		return primaryCustomer;
	}

	public void setPrimaryCustomer(char primaryCustomer) {
		this.primaryCustomer = primaryCustomer;
	}

	public String getTokenAssigned() {
		return tokenAssigned;
	}

	public void setTokenAssigned(String tokenAssigned) {
		this.tokenAssigned = tokenAssigned;
	}
	
	

	public String getCounterAssigned() {
		return counterAssigned;
	}

	public void setCounterAssigned(String counterAssigned) {
		this.counterAssigned = counterAssigned;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", primaryCustomer=" + primaryCustomer
				+ ", tokenAssigned=" + tokenAssigned + "]";
	}
	
	


}
