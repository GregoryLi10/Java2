package Guides;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList<>();
		myList.add(5);
		System.out.println(myList);
		myList.remove((Integer)5);
		System.out.println(myList);
	}	
}