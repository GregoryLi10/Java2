package BankAccount;

public class GreatAccount extends BankAccount {
	int withdraws=3, month=0;
	public GreatAccount(String name, int n) {
		super(name, n);
	}
	
	public void nextMonth() {
		if (month>=11) {
			month=-1; 
			if (withdraws==3) super.deposit(getAmount());
		}
		month++;
		withdraws=3;
	}
	
	public void withdraw(int n) {
		if (withdraws<=0) return;
		super.withdraw(n);
		withdraws--;
	}
	
	public String toString() {
		return super.toString()+" withdraws left this month: "+withdraws+" month: "+(month+1);
	}
	
	
	public static void main (String[] args) {
		GreatAccount a=new GreatAccount("h", 20);
		System.out.println(a);
		for (int i=0; i<12; i++)
			a.nextMonth();
		System.out.println(a);
	}
}
