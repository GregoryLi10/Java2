package BankAccount;

public class BankAccount {
	private String name; private int amount;
	public BankAccount(String name, int amount) {
		this.name=name;
		this.amount=amount;
	}
	
	public BankAccount(String name) {
		this.name=name;
		amount=0;
	}
	
	public void deposit(int n) {
		amount+=n;
	}
	
	public void withdraw(int n) {
		amount-=Math.abs(n);
	}
	
	public String toString() {
		return name+"'s bank account has $"+amount+".";
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main (String[] args) {
		BankAccount a=new BankAccount("Gregory", 20);
		BankAccount b=new BankAccount("Friedman", 50);
		b.deposit(50);
		a.deposit(500);
		b.withdraw(20);
		
		System.out.println(a);
		System.out.println(b);
	}
}
