package Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListAlgs {
	public static ArrayList<Integer> random(int n, int x){
		ArrayList<Integer> list=new ArrayList<Integer>(n);
		for (int i=0; i<n; i++)
			list.add((int)(Math.random()*(2*x+1))-x);
		return list;
	}
	
	public static ArrayList<Integer>[] separate(ArrayList<Integer> list){
		ArrayList<Integer>[] arr=new ArrayList[2];
		arr[0]=new ArrayList<Integer>(); arr[1]=new ArrayList<Integer>();
		for (int temp:list)
			if (temp>=0) arr[0].add(temp);
			else arr[1].add(temp);
		return arr;
	}
	
	public static void reverse(ArrayList<Integer> list){
		for (int i=0; i<list.size()/2; i++)
			list.set(i, list.set(list.size()-i-1, list.get(i)));
	}
	
	public static void main (String[] args) {
		System.out.println(random(10, 5));
		ArrayList<Integer> a=new ArrayList<Integer>();
		Collections.addAll(a, -1,-2,-3,4,5,6,7);
		System.out.println(Arrays.toString(separate(a)));
		reverse(a);
		System.out.println(a);
	}
}
