package entities;

public class Usuario {
	
	private int account;
	private String name;
	private double balance;
	public static final double TAX = 5.00;
	
	public Usuario(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		this.balance = balance + value;
	}
	
	public void withdraw(double value) {
		this.balance = balance - value - TAX;
	}
	
	
	public String toString() {
		return "Account " + getAccount() + ", Holder: " + getName() + ", Balance: $" + String.format("%.2f", getBalance());
	}
	
	
}
