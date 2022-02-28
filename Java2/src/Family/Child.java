package Family;

import java.util.ArrayList;

public class Child extends Person{
	private ArrayList<Person> parents=new ArrayList<Person>();
	public Child(int age, String name) {
		super(age, name);
		parents.add(null); parents.add(null);
	}
	
	public Child(int age, String name, Parent h) {
		super(age, name);
		parents.add(h); parents.add(null);
	}
	
	public Child(int age, String name, Parent h, Parent h1) {
		super(age, name);
		parents.add(h); parents.add(h1);
	}
	
	@Override
	public ArrayList<Person> getChildren() {
		return null;
	}

	@Override
	public ArrayList<Person> getParents() {
		return parents;
	}

	@Override
	public ArrayList<Person> addChildren(ArrayList<Person> a) {
		return null;
	}

	@Override
	public ArrayList<Person> addParents(ArrayList<Person> a) {
		parents.addAll(a);
		return parents;
	}

}
