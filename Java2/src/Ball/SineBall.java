package Ball;

import java.awt.Color;
import java.util.ArrayList;

public class SineBall extends CollisionBall{

	public SineBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, ArrayList<Ball> arr, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, arr, startcolor);
	}
	
	public void move() {
		setX(getX()+getXSpeed()/4);
		setY((int) (Math.sin(getX()/20.0)*70+HEIGHT/2));
		super.move();
	}

}
