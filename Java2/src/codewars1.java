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
	
	public static void main(String[] args) {
//		System.out.println(digPow(46288, 3));
//		System.out.println(check("aAqweEqwpeoiz"));
//		System.out.println(Arrays.toString(sortArray(new int[]{9,8,7,6,5,4,3,2,1,0})));
//		System.out.println(validateWord("?abc:abc"));
	}
}
