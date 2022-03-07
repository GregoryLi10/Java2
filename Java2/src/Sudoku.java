import java.util.Arrays;

public class Sudoku {
	public static int[][] generate() {
		int n=9;
		int[][] matrix=new int[9][9];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				boolean[] temp=new boolean[9];
				int ran=(int) (Math.random()*9)+1;
				while (valid(ran, matrix, i, j)[0].equals(false)) {
					temp[ran-1]=false;
					ran=(int) (Math.random()*9)+1;
					if (!temp[ran-1]) continue;
				}
				matrix[i][j]=ran;
				for (int[] a:matrix)
				System.out.println(Arrays.toString(a));
				System.out.println();
			}
		}
		return matrix;
	}
	
	public static Object[] valid(int n, int[][] matrix, int x, int y) {
		for (int i=0; i<matrix.length; i++) {
			if (i!=x) {
				if (matrix[i][y]==n) {
					int ran=(int)(Math.random()*9)+1;
					while (valid(ran,matrix, i, y).equals(false)) {
						ran=(int)(Math.random()*9)+1;
					}
					return new Object[] {false, i, y, ran};
				}
			}
		}
		
		for (int i=0; i<matrix.length; i++) {
			if (i!=y) {
				if (matrix[x][i]==n) {
					int ran=(int)(Math.random()*9)+1;
					while (valid(ran,matrix, x, i).equals(false)) {
						ran=(int)(Math.random()*9)+1;
					}
					return new Object[] {false, x, i, ran};
				}
			}
		}
		
		for (int i=x/3*3; i<x/3*3+3; i++) {
			for (int j=y/3*3; j<y/3*3+3; j++) {
				if (i!=x&&j!=y) 
					if (matrix[i][j]==n) {
						int ran=(int)(Math.random()*9)+1;
						while (valid(ran,matrix, i, j).equals(false)) {
							ran=(int)(Math.random()*9)+1;
						}
						return new Object[] {false, i, j, ran};
					}
			}
		}
		
		return new Object[] {true};
	}
	
	public static void main(String[] args) {
		int[][] temp=generate();
		for (int[] a:temp)
			System.out.println(Arrays.toString(a));
	}
}
