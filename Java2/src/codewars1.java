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
	
	public static void main(String[] args) {
		System.out.println(digPow(46288, 3));
		System.out.println(check("aAqweEqwpeoiz"));
	}
}
