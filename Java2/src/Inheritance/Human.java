package Inheritance;

public class Human {
	
	
	private int age;
	private int height;
	private String name;
	
	//constructor
	public Human(int age, int height, String name) {
		this.age=age;
		this.height=height;
		this.name=name; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public int height() {
		return height;
	}
	
	public String toString() {
		return "name: "+name+", age: "+age+", height: "+height;
	}
	
	public void eat(int foodAmount) {
		height+=foodAmount/10;
	}
	
	public boolean isTaller(Human other) {
		return height>other.height;
	}
	
	public void getOlder() {
		age++;
	}
	
//	public static void main(String[] args) {
//		Human a=new Human(0, 0, "name1");
//		Human b=new Human(0, 1, "name2");
//		a.eat(105);
//		System.out.println(a.isTaller(b));
//		System.out.println(a);
//	}
}
