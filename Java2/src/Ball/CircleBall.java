package Ball;

import java.awt.Color;
import java.util.ArrayList;

public class CircleBall extends CollisionBall{
	private int c=0;
	public CircleBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, ArrayList<Ball> arr, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, arr, startcolor);
	}
	
	public void move() {
		c++;
		setX((int) (WIDTH/2+Math.cos(c/10.0)*100));
		setY((int) (HEIGHT/2+Math.sin(c/10.0)*100));
		super.move();
	}
}
