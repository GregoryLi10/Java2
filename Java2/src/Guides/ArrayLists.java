package Guides;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList<>();
		myList.add(5);
		System.out.println(myList.set(0, 3));
		System.out.println(myList.remove((Integer)3));
		System.out.println(myList);
	}	
}