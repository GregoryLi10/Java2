import java.util.Arrays;

public class nextSmallestNumber {

	public static int nextSmallest(int n) {
		int[] a=new int[(int) (Math.log10(n)+1)];
		for (int i=a.length-1; i>=0; i--) {
			a[i]=n%10;
			n/=10;
		}
		
		int index=-1, i1=0;
		for (int i=a.length-2; i>=0; i--) {
			int temp=-1;
			i1=i;
			for (int j=a.length-1; j>i; j--) {
				if (a[j]<a[i]&&a[j]>temp) {
					index=j;
					temp=a[j];
				}
			}
			if (index!=-1) break;
		}
		if (i1==-1) return i1;
		
		int temp1=a[index];
		a[index]=a[i1];
		a[i1]=temp1;
		for (int i=i1+1; i<a.length; i++) {
			int temp=a[i];
			int k=i;
			temp=a[i];
			for (int j=i+1; j<a.length; j++) {
				if (a[j]>temp) {
					k=j;
					temp=a[j];
				}
			}
			a[k]=a[i];
			a[i]=temp;
		}
		
		if (a[0]==0) return -1;
		
		int num=0;
		for (int x:a) {
			num=10*num+x;
		}
		if (a[0]==0) {
			num*=10;
			for (int i=1; i<a.length; i++) {
				if (a[i]==0&&a[i-1]==0) num*=10;
				else break;
			}
		}
		return num;
	}
	
	public static long small(long n) {
		long[] a=new long[(int) (Math.log10(n)+1)];
		for (int i=a.length-1; i>=0; i--) {
			a[i]=n%10;
			n/=10;
		}
		
		int index=-1;
		int i1=0;
		for (int i=a.length-2; i>=0; i--) {
			long temp=-1;
			i1=i;
			for (int j=a.length-1; j>i; j--) {
				if (a[j]<a[i]&&a[j]>temp) {
					index=j;
					temp=a[j];
				}
			}
			if (index!=-1) break;
		}
		
		if (index==-1) return -1;
		
		long temp1=a[index];
		a[index]=a[i1];
		a[i1]=temp1;
		for (int i=i1+1; i<a.length; i++) {
			long temp=a[i];
			int k=i;
			temp=a[i];
			for (int j=i+1; j<a.length; j++) {
				if (a[j]>temp) {
					k=j;
					temp=a[j];
				}
			}
			a[k]=a[i];
			a[i]=temp;
		}
		
		if (a[0]==0) return -1;
		long num=0;
		for (long x:a) {
			num=10*num+x;
		}
		if (a[0]==0) {
			num*=10;
			for (int i=1; i<a.length; i++) {
				if (a[i]==0&&a[i-1]==0) num*=10;
				else break;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(small(414));
	}
}
