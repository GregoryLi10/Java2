package Family;

import java.util.ArrayList;
import java.util.Arrays;

public class Family {
	private ArrayList<Person>[] family=new ArrayList[3];
	
	public Family() {
		for (int i=0; i<family.length; i++) {
			family[i]=new ArrayList<Person>();
		}
	}
	
	public void add(Person h) {
		if (h.getClass()==Child.class) {
			family[2].add(h);
			outerloop:
			for (int i=0; i<h.getParents().size(); i++) {
				for (int j=0; j<family[1].size(); j++) {
					if (h.getParents().get(i)==null) {
						family[1].add(h.getParents().get(i));
						continue outerloop;
					}
					if (h.getParents().get(i).equals(family[1].get(j))) continue outerloop;
				}
				family[1].add(h.getParents().get(i));
			}
		}
		
		else if (h.getClass()==Parent.class) {
			family[1].add(h);
			outerloop:
			for (int i=0; i<h.getChildren().size(); i++) {
				for (int j=0; j<family[2].size(); j++) {
					if (h.getChildren().get(i)==null) {
						family[2].add(h.getChildren().get(i));
						continue outerloop;
					}
					if (h.getChildren().get(i).equals(family[2].get(j))) continue outerloop;
				}
				family[2].add(h.getChildren().get(i));
			}
			outerloop:
			for (int i=0; i<h.getParents().size(); i++) {
				for (int j=0; j<family[0].size(); j++) {
					if (h.getParents().get(i)==null) {
						family[0].add(h.getParents().get(i));
						continue outerloop;
					}
					if (h.getParents().get(i).equals(family[0].get(j))) continue outerloop;
				}
				family[0].add(h.getParents().get(i));
			}
		}
		
		else if (h.getClass()==GrandParent.class) {
			family[0].add(h);
			outerloop:
			for (int i=0; i<h.getChildren().size(); i++) {
				for (int j=0; j<family[1].size(); j++) {
					if (h.getChildren().get(i)==null) { 
						
						continue outerloop;
					}
					if (h.getChildren().get(i).equals(family[1].get(j))) continue outerloop;
				}
				family[1].add(h.getChildren().get(i));
			}
		}
	}
	
	public void connect(Person a, Person b) {
		if (a.getClass()==GrandParent.class) {
			a.getChildren();
		}
	}
	
	public String toString() {
		return Arrays.toString(family);
	}
	
}
