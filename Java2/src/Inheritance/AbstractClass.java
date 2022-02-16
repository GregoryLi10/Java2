package Inheritance;

public abstract class AbstractClass {
	private String name;
	private int age;
	public AbstractClass(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void addAge() {
		age++;
	}
	
	public abstract void speak();
}

//interfaces 
//class x implements y {
//	
//}
