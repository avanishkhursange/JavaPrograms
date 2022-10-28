package bean;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int pinNumber;
	private int balance;
	
	public Customer() {
		
	}
	
	public Customer(String name, int pinNumber, int balance) {
		super();
		this.name = name;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", pinNumber=" + pinNumber + ", balance=" + balance + "]";
	}
}
