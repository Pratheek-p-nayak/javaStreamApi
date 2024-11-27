package pkg1;

public class P1 {
	private String name;
	private long accountNo;
	private int balance;
	public P1() {
	}
	public P1(String name,long accNo,int balance) {
		this.name=name;
		this.accountNo=accNo;
		this.balance=balance;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAccountNo(long accNo) {
		this.accountNo=accNo;
	}
	public long getAccNo() {
		return this.accountNo;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public void displayBalance() {
		System.out.println("Your balance is: "+this.balance);
	}
	public void withdraw(int amount) {
		if(this.balance>=amount) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Insufficient balance to withdraw. ");
		}
	}
	public void deposit(int amount) {
		this.balance=this.balance+amount;
	}
}
