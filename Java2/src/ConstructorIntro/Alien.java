package ConstructorIntro;

public class Alien {
	private int age, limbs; 
	private String name;
	public Alien(int age, String name, int limbs) {
		this.age=age;
		this.limbs=limbs;
		this.name=name;
	}
	
	public void yearsPassed(int n) {
		age=Math.max(age+n, 0);
		limbs=Math.max(limbs+n/2, 0);
	}
	
	public void nameChange(String newName, String oldName) {
		if(verify(oldName))
			name=newName;
	}
	
	public boolean verify(String oldName) {
		if (oldName.equals(name)) return true;
		return false;
	}
	
	public boolean vote(int year) {
		if (year%4==0)
			return age>=18;
		return false;
	}
	
	public String toString() {
		return "My name is " +name+". I am "+age+" years old, I have "+limbs+" limbs.";
	}
	
	public static void main(String[]args) {
		Alien a=new Alien(25, "qwerty", 5);
		System.out.println(a);
		a.yearsPassed(-5);
		a.nameChange("ytrewq", "qwerty");
		System.out.println(a.vote(2016));
		System.out.println(a);
	}
	
}
