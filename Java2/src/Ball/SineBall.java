package Ball;

import java.awt.Color;
import java.util.ArrayList;

public class SineBall extends CollisionBall{
	private int startY;
	public SineBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, ArrayList<Ball> arr, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, arr, startcolor);
		this.startY=starty;
	}
	
	public void move() {
		setX(getX()+getXSpeed()/4);
		setY((int) (Math.sin(getX()/20.0)*70+startY));
		super.move();
	}

}
