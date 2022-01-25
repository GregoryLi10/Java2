
public class BankAccount {
	private String name; private double intRate; private int amount;
	public BankAccount(String name, double intRate, int amount) {
		this.name=name;
		this.intRate=intRate;
		this.amount=amount;
	}
	
	public BankAccount(String name, double intRate) {
		this.name=name;
		this.intRate=intRate;
		amount=0;
	}
	
	public void deposit(int n) {
		amount+=n;
	}
	
	public void withdraw(int n) {
		amount-=Math.abs(n);
	}
	
	public void addInt() {
		amount+=amount*(intRate/100);
	}
	
	public String toString() {
		return name+"'s bank account has $"+amount+". The interest rate is "+intRate+"%.";
	}
	
	public static void main (String[] args) {
		BankAccount a=new BankAccount("Gregory", 20, 500);
		BankAccount b=new BankAccount("Friedman", 50);
		b.deposit(50);
		a.addInt();
		b.addInt();
		a.deposit(500);
		b.withdraw(20);
		
		System.out.println(a);
		System.out.println(b);
	}
}
