import java.util.*;
public class minKnightMoves {

	
	public static int knight(String start, String  finish) {
      if (start.equals(finish)) return 0;
        int sx=start.charAt(0)-97, sy=start.charAt(1)-49, fx=finish.charAt(0)-97, fy=finish.charAt(1)-49;
        int[][]moves={{-2, -1}, {-1, -2},{1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
        ArrayList<int[]> temp=new ArrayList<>();
        temp.add(new int[] {sx, sy});
        int prev=0;
        for (int c=1; sx!=fx||sy!=fy; c++) {   
        	int a=temp.size();
        	for (int i=prev; i<a; i++) {
        		int ox=temp.get(i)[0], oy=temp.get(i)[1];
        		for (int j=0; j<8; j++) {
        			sx=ox+moves[j][0];
        			sy=oy+moves[j][1];
	        		if (sx<0||sx>7||sy<0||sy>7) continue;
	        		if (sx==fx&&sy==fy) return c;
	        		temp.add(new int[] {sx, sy});
        		}
        		prev=i;
        	}
        }
        return -1;
    }
	
//	for (int z=0; z<temp.size(); z++)
//		System.out.println(Arrays.toString(temp.get(z)));
//	System.out.println();
	
	public static void main (String[] args) {
		System.out.println(knight("a1", "a1"));
	}
}
