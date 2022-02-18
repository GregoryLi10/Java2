import java.util.ArrayList;
import java.util.Arrays;

public class codewars1 {
	public static long digPow(int n, int p) {
		if (n==0) return -1;
		int num=0, temp=n;
		for (int i=0; i<Math.log10(n)+1; n/=10) {
			num+=n%10;
			num*=10;
		}
		num/=10;
		System.out.println(num);
		long x=0;
		for (int i=0, j=p; i<Math.log10(num)+1; j++) {
			x+=Math.pow(num%10, j);
			num/=10;
		}
		
		if (x%temp==0) return x/temp;
		return -1;
	}
	
	  public static boolean check(String sentence){
		  sentence=sentence.toLowerCase();
		  boolean[] a=new boolean[26];
		  for (int i=0; i<sentence.length(); i++) {
			  if (sentence.charAt(i)-97<26&&sentence.charAt(i)-97>=0)
				  a[sentence.charAt(i)-97]=true;
		  }
		  int c=0;
		  for (boolean x:a) {
			  if (x) c++;
		  }
		  return c==26;
	  }
	  
	  public static int[] sortArray(int[] arr) {
	    int[] a=new int[arr.length];
	    for (int i=0, j=0; i<a.length; i++, j++){
	      if (arr[i]%2!=0){
	        a[j]=arr[i];
	        continue;
	      }
	      j--;
	    }
	    Arrays.sort(a);
	    int index=0;
	    for (int i=0; i<a.length; i++) {
	    	if (a[i]!=0) {
	    		index=i;
	    		break;
	    	}
	    }
	    for (int i=0, j=index; i<a.length; i++){
	      if (arr[i]%2!=0){
	        arr[i]=a[j];
	        j++;
	      }
	    }
	    return arr;
	  }
	  
	  public static boolean validateWord(String word) {
		  int[] a=new int[word.length()];
		    char[] b=new char[word.length()];
		    word=word.toLowerCase();
		    for (int i=0; i<word.length(); i++){
		      for (int j=0; j<b.length; j++){
		    	if (word.charAt(i)==b[j]) {
		    		a[j]++; break;
		    	}
		    	else if (word.charAt(i)!=b[j]&&b[j]!=(char)0)
		        	continue;
		        else if (b[j]==(char)0) {
		        	b[j]=word.charAt(i);
		        	break;
		        }
		      }
		    }
		    
		    for (int i=1; i<a.length; i++) {
		    	if (b[i]==(char)0) break;
		    	if (a[i]!=a[0]) return false;
		    }
		    return true;
	  }
  
	  public static int peakHeight(char[][] m) {
	    boolean[][] a=new boolean[m.length][m[0].length];
	    int c=0;
	    for (int i=0; i<m.length; i++){
		      for (int j=0; j<m[i].length; j++){
		    	  if(m[i][j]==' ')
			          a[i][j]=true;
		      }
	    }
	    
	    for (int i=0; i<m.length; i++){
	      for (int j=0; j<m[i].length; j++){
	        if (a[i][j])continue;
	        else{
	          c++;
	          a[i][j]=true;
	          for (int y=0; y<m[0].length; y++) {
	        	  a[c-1][y]=true;
	        	  a[m.length-c][y]=true;
	          }
	          for (int x=c; x<m.length-c; x++) {
	        	  if (m[x][m[x].length-c-1]=='^') a[x][m[x].length-c-1]=true;
	        	  else {
		        	  for (int k=m[x].length-1; k>=0; k--) {
		        		  if (a[x][k]||m[x][k]==' ') continue;
		        		  a[x][k]=true; break;
		        	  }
	        	  }
	        	  if (m[x][c]=='^') a[x][c]=true;
	        	  else {
        		  	for (int k=1; k<m[x].length; k++) {
        		  		if (a[x][k]) continue;
        		  		a[x][k]=true; break;
		        	  }
	        	  }
	          }
	          for (boolean[] q:a) {
	        	  System.out.println(Arrays.toString(q));
	          }
	          System.out.println();
	          break;
	        }
	      }
	    }
	    return c;
	  }
	  
	  public static int calculateCombinations(char startPosition, int patternLength){
		  char[][] let= {
				  {'a', 'b', 'c'},
				  {'d', 'e', 'f'},
				  {'g', 'h', 'i'}};
		  boolean[][] a=new boolean[3][3];
		  
		  for (int i=0; i<let.length; i++) {
			  for (int j=0; j<let[i].length; j++) {
				  
			  }
		  }
		  
		  return 0;
	  }
	  
	  public static String intToRoman(int n) {
		  String str="";
		  int t=0;
		  String[] romans = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		  int[] nums = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		  for (int i=nums.length-1; i>=0; i--) {
			  t=n/nums[i];
			  n%=nums[i];
			  while (t>0) {
				  str+=(romans[i]);
				  t--;
			  }
		  }
		  return str;
	  }
	  
	  public static int fromRoman(String romanNumeral) {
	      int n=0;
		  String[] romans = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		  int[] nums = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		  for (int i=romanNumeral.length(); i>0; i--) {
			  if (i>1&&(romanNumeral.substring(i-2, i).equals("IV")||romanNumeral.substring(i-2, i).equals("IX")||romanNumeral.substring(i-2, i).equals("XL")||romanNumeral.substring(i-2, i).equals("XC")||romanNumeral.substring(i-2, i).equals("CD")||romanNumeral.substring(i-2, i).equals("CM"))) {
				  for (int j=0; j<romans.length; j++) {
					  if (romans[j].length()==1) continue;
					  if (romanNumeral.substring(i-2, i).equals(romans[j])) {
						  n+=nums[j];
						  i--;
						  romanNumeral=romanNumeral.substring(0,i-1);
						  break;
					  }
				  }
			  }
			  else {
				  for (int j=0; j<romans.length; j++) {
					  if (romanNumeral.substring(i-1, i).equals(romans[j])) {
						  n+=nums[j];
						  romanNumeral=romanNumeral.substring(0,i);
						  break;
					  }
				  }
			  }
		  }
		  return n;
	  }
	  
	  public static int calculateSpace(int[][] rectangles) {
//		  int[][] temp=rectangles;
		  int area=0;
		  for (int i=0; i<rectangles.length; i++) {
			  area+=Math.abs((rectangles[i][2]-rectangles[i][0])*(rectangles[i][3]-rectangles[i][1]));
		  }
		  for (int i=0; i<rectangles.length-1; i++) {
			  for (int j=i+1; j<rectangles.length; j++) {
//				  if (rectangles[i][0]>=rectangles[j][0]&&rectangles[i][0]<rectangles)
			  }
		  }
		  return area;
	  }
	    
	  public static String solve(String s) {
		  ArrayList<Integer>arr=new ArrayList<Integer>();
		  String[] aa=s.split(" ");
		  char[][] a=new char[aa.length/2+1][];
		  int[][] temp;
		  temp=new int[a.length][];
		  for (int i=0, j=0; j<aa.length; i++, j++) {
			  if (aa[j].equals("+")||aa[j].equals("=")) {
				  i--; continue;
			  }
			  a[i]=new char[aa[j].length()];
			  for (int k=0; k<a[i].length; k++) {
				  a[i][k]=aa[j].charAt(k);
			  }
			  temp[i]=new int[a[i].length];
		  }
		  for (char[] asd: a)
			  System.out.println(Arrays.toString(asd));
		  for (int[] asd: temp)
			  System.out.println(Arrays.toString(asd));
		  
		  
		  
//		  for (int i=0; i<a.length; i++) {
//			  if (a[i].equals("+")||a[i].equals("=")) continue;
//			  temp[i]=new int[a[i].length];
//		  }
		  
		  
		  return null;
	  }
	  
	  public static boolean check(int[][] sudoku) {
	       for (int i=0; i<sudoku.length; i++) {
	    	   for (int j=0; j<sudoku[i].length; j++) {
	    		   if (sudoku[i][j]==0) return false;
    	    	   for (int y=j+1; y<sudoku[i].length; y++) {
    	    		   if (sudoku[i][y]==sudoku[i][j]) return false;
	    		   }
    	    	   for (int x=i+1; x<sudoku.length; x++) {
	    			   if (sudoku[x][j]==sudoku[i][j]) return false;
	    		   }
	    	   }
	       }
	       for (int i=0; i<sudoku.length-2; i+=3) {
    		   for (int j=0; j<sudoku[i].length-2; j+=3) {
    			   int temp[]=new int[9]; int c=0;
    			   for (int x=i; x<i+3; x++) {
    				   for (int y=j; y<j+3; y++) {
    					   temp[c]=sudoku[x][y]; c++;
    				   }
    			   }
    			   for (int t=0; t<temp.length; t++) {
					   for (int t1=t+1; t1<temp.length; t1++) {
						   System.out.println(temp[t]+" "+temp[t1]);
						   if (temp[t]==temp[t1]) return false;
					   }
				   }
    		   }
	       }
	       return true;
	  }

//	private int a; private String s, original; private ArrayList<String> arr=new ArrayList<String>();
//	public String decode(String r) {
//		for (int c=0; c<r.length(); c++) {
//			s="";
//			r=r.toLowerCase();
//			int index=0;
//			for (int i=0; i<r.length(); i++) {
//				if (r.charAt(i)>=97&&r.charAt(i)<123) {
//					index=i; break;
//				}
//			}
//			a=Integer.valueOf(r.substring(0, index));
//			r=r.substring(index, r.length());
//			arr.add(r);
//			for (int j=0; j<r.length(); j++) {
//				for (int i=0; i<26; i++) {
//					if ((i*a)%26==r.charAt(j)-97) {
//						index=i;
//						break;
//					}
//				}
//				s+=(char) (index+97);
//			}
//			arr.add(s);
//			if (arr.get(c+1).equals(arr.get(0)))
//				return s;
//			else decode(a+arr.get(c));
//		}
//		return "Impossible to decode";
//	}
	
	public static void main(String[] args) {
		
	}
}
