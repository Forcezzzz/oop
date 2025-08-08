package p4_2;
import p4_1.Date;

public class BankAcc {
	private String name;
	private double balance;
	private Date date = new Date (25,7,2025);
	
	public BankAcc() {
		
	}
	public BankAcc(String name) {
		this.name = name; 
		this.balance = 0;
	}
	public BankAcc(String name,double amount,Date date) {
		this.name = name;
		this.balance += amount;
		this.date = date;
	}
	public void deposit(double amount) {
		this.balance += amount; 
	}
	public boolean withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		else
			return false;
	}
	public void transfer (BankAcc other,double amount) {
		if(withdraw(amount)) {
			other.balance += amount;
		}
	}
	public double getBalance() {
		return this.balance;
	}
	public String getInfo() {
		return "Name : " + name +" Date : "+date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
	}
}
