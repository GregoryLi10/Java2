package Family;

import java.util.ArrayList;

public abstract class Person {
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return name+", "+age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public abstract ArrayList<Person> getChildren();
	public abstract ArrayList<Person> getParents();
	public abstract ArrayList<Person> addChildren(ArrayList<Person> a);
	public abstract ArrayList<Person> addParents(ArrayList<Person> a);
}
