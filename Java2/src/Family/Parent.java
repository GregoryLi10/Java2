package Family;

import java.util.ArrayList;

public class Parent extends Person{
	private ArrayList<Person> children=new ArrayList<Person>();
	private ArrayList<Person> parents=new ArrayList<Person>();
	public Parent(int age, String name) {
		super(age, name);
		children.add(null);
		parents.add(null); parents.add(null);
	}
	
	@Override
	public ArrayList<Person> getChildren() {
		return children;
	}

	@Override
	public ArrayList<Person> getParents() {
		return parents;
	}
	
	@Override
	public ArrayList<Person> addChildren(ArrayList<Person> a) {
		children.addAll(a);
		return children;
	}

	@Override
	public ArrayList<Person> addParents(ArrayList<Person> a) {
		parents.addAll(a);
		return parents;
	}

}
