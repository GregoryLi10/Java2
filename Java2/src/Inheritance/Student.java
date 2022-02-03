package Inheritance;

public class Student extends Human{
	private int form;
	
	public Student(int age, int height, String name, int form) {
		super(age, height, name);
		this.form=form;
	}
	
	public void study() {
		System.out.println("study");
	}
	
	@Override
	public void eat(int amount) {
		
	}
	
	public void getOlder() {
		super.getOlder();
		form++;
	}
	
	public String toString() {
		return "name: "+getName()+", age: "+getAge()+", height: "+getHeight()+" form: "+form;
	}
	
	public static void main (String[] args) {
		Student a=new Student(5, 10, "name", 3);
		a.getOlder();
	}

}
