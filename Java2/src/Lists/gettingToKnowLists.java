package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class gettingToKnowLists {

	public static ArrayList<Character> removeSecond(ArrayList<Character> list) {
		for (int i=0; i<list.size(); i+=2)
			list.remove(i);
		return list;
	}
	
	public static ArrayList<String> reverse(ArrayList<String> list){
		for (int i=0; i<list.size()/2; i++)
			list.set(i, list.set(list.size()-i-1,list.get(i)));
		return list;
	}
	
	public static ArrayList<Double> doubleList(ArrayList<Double> list){
		for (int i=0; i<list.size(); i++) 
			list.set(i,list.get(i)*2);
		return list;
	}
	
	public static ArrayList<Character> addChars(int n){
		ArrayList<Character> list=new ArrayList<Character>();
		for (int i=0; i<n; i+=2) {
			list.add(0,(char)(i+97));
			list.add((char)(i+98));
		}
		if (list.size()>n) list.remove(list.size()-1);
		return list;
	}
	
	public static void main (String[] args) {
		ArrayList<Character> a=new ArrayList<Character>();
		Collections.addAll(a,'a', 'b', 'c', 'd', 'e');
		System.out.println(removeSecond(a));
		
		ArrayList<String> b=new ArrayList<String>();
		Collections.addAll(b,"science", "computer", "hi");
		System.out.println(reverse(b));
		
		ArrayList<Double> c=new ArrayList<Double>();
		Collections.addAll(c,2.0,3.0,5.5);
		System.out.println(doubleList(c));
		
		System.out.println(addChars(5));
	}
}
