import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Photoshoot {

	public static void test() {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] a=new int[2][n];
		for (int c=0; c<2; c++) {
			for (int i=0; i<n; i++) {
				a[c][i]=in.nextInt();
			}
		}
		if (Arrays.equals(a[0], a[1])) { 
			System.out.println(0);
			return;
		}
		ArrayList<Integer> ind1=new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (a[1][i]==a[0][j]) 
					ind1.add(j);
			}
		}
		System.out.println(ind1.size());
	}
	
	public static void main(String[] args) {
		test();
	}
}

