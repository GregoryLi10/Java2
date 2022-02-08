package BankAccount;

public class CreditCard extends InterestAccount {

	public CreditCard(String name, int amount, double intRate) {
		super(name, amount, intRate);
	}
	
	public void addInt() {
		super.addInt();
		super.withdraw(10);
	}
	
	public void withdraw(int n) {
		if (getAmount()-n<100) return;
		super.withdraw(n);
	}
	
	public static void main (String[] args) {
		CreditCard a=new CreditCard("h", 50, 100);
		a.addInt();a.addInt();
		a.withdraw(80);
		System.out.println(a);
	}
}
