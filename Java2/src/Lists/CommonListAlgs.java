package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonListAlgs {
	public static int avg(ArrayList<Integer> list) {
		int sum=0;
		for (int temp:list)
			sum+=temp;
		return list.size()==0?0:sum/list.size();
	}
	
	public static int min(ArrayList<Integer> list) {
		if (list.size()==0) return -1;
		int min=list.get(0);
		for (int temp:list)
			if (temp<min) min=temp;
		return min;
//		return Collections.min(list);
	}
	
	public static ArrayList<Integer> fibonacci(int n){
		if (n==0) return null;
		if (n==1) return new ArrayList<Integer>(Arrays.asList(0));
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(0, 1));
		for (int i=2; i<n; i++) 
			list.add(list.get(i-1)+list.get(i-2));
		return list;
	}
	public static void main (String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		Collections.addAll(a, 1,2,3,4,5);
		System.out.println(avg(a));
		System.out.println(min(a));
		System.out.println(fibonacci(10));
	}
}
