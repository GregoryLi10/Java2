import java.util.Arrays;


public class Nonogram {

  static int N=5;
  static int[][] a;
  static boolean found;

  static boolean valid(String clue,int[] a){
    int t,i;
    String s="";
    for(t=0,i=0;i<N;i++)
      if(a[i]==1) t++; else
      if(t>0) {s+=t;t=0;}
    return (t>0?s+t:s).equals(clue);
  }

  static int[] col(int c){
    int[] b=new int[N];
    for(int i=0;i<N;i++) b[i]=a[i][c];
    return b;
  }

  static void dfs(String[] clues, int i){
    int y=i/N, x=i%N;
    if(x==0 && y >0   && !valid(clues[N-1+y], a[y-1])) return;
    if(x==0 && y==N   && !valid(clues[N-1], col(N-1))) return;
    if(x >0 && y==N-1 && !valid(clues[x-1], col(x-1))) return;
    if(y==N) found = true;
    if(!found) { a[y][x]=0; dfs(clues, i+1); }
    if(!found) { a[y][x]=1; dfs(clues, i+1); }
    
  }

  static int[][] solve(int[][][] clues) {
    int i=0;
    String[] s=new String[2*N];
    for(int[][] c:clues)
      for(int [] d:c){
        String t="";
        for(int e:d) t+=e;
        s[i++]=t;
      }
    System.out.println(Arrays.toString(s));
    a=new int[N][N];
    found=false;
    dfs(s,0);
    return found?a:null;
  }

    
    public static void main (String[] args) {
    	int[][] a=solve(new int[][][]{{{1, 1}, {4}, {1, 1, 1}, {3}, {1}}, {{1}, {2}, {3}, {2, 1}, {4}}});
    	for (int[] hi: a)
    		System.out.println(Arrays.toString(hi));
    }
}