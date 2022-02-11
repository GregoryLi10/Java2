package Ball;

import java.awt.Color;
import java.util.ArrayList;

public class CollisionBall extends BouncingBall{
	ArrayList<Ball> arr;
	private boolean a=false;
	public CollisionBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, ArrayList<Ball> arr, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
		this.arr=arr;
	}
	
	public void move() {
		super.move();
		int c=0;
		for (int i=0; i<arr.size(); i++) {
			if (arr.get(i).equals(this)) continue;
			if (Math.sqrt(Math.pow(getX()-arr.get(i).getX(), 2)+Math.pow(getY()-arr.get(i).getY(), 2))<=getRad()/2+arr.get(i).getRad()/2){
				if (a) return;
				setXSpeed(getXSpeed()*-1);
				setYSpeed(getYSpeed()*-1);
				a=true;
			}
			else c++;
		}
		a=!(c==arr.size()-1);
	}
}
