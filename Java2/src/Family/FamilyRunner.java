package Family;

import java.util.Scanner;

public class FamilyRunner {

	public static void main (String[] args) {
		Family fam=new Family();
		Person Ca=new Child(0, "child a");
		Person Pa=new Parent(50, "parent a");
		Person Ga=new GrandParent(100, "grandparent a");
		fam.add(Ca);
		fam.add(Pa);
		fam.connect(Ca, Pa);
		System.out.println(fam);
	}
	
}
