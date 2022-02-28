package Family;

import java.util.ArrayList;
import java.util.Arrays;

public class GrandParent extends Person{
	private ArrayList<Person> children=new ArrayList<Person>();
	public GrandParent(int age, String name) {
		super(age, name);
		children.add(null);
	}
	
	public GrandParent(int age, String name, Parent p) {
		super(age, name);
		children.add(p);
	}

	public ArrayList<Person> addChildren(Parent h){
		children.add(h);
		return children;
	}
	
	public String toString() {
		return super.toString()+" connected to "+children;
	}

	@Override
	public ArrayList<Person> getChildren() {
		return children;
	}

	@Override
	public ArrayList<Person> getParents() {
		return null;
	}

	@Override
	public ArrayList<Person> addChildren(ArrayList<Person> a) {
		children.addAll(a);
		return children;
	}

	@Override
	public ArrayList<Person> addParents(ArrayList<Person> a) {
		return null;
	}
	
}
