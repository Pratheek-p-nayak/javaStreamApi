package pkg1;

public class P1Main {
	public static void main(String[] args) {
		P1 p1=new P1();
		p1.setName("Akash");
		p1.setAccountNo(12345667);
		p1.setBalance(350000);
		p1.displayBalance();
		p1.withdraw(100000);
		p1.displayBalance();
		p1.deposit(3000);
		p1.displayBalance();
		System.out.println();
		P1 p2=new P1("Aditya",32561575,300000);
		p2.displayBalance();
		p2.withdraw(100000);
		p2.displayBalance();
		p2.deposit(3000);
		p2.displayBalance();
	}
}
