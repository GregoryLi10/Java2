package Ball;

import java.awt.Color;

public class BouncingBall extends ColorBall{

	public BouncingBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
	}
	
	public void move() {
		if (getX()+getRad()>=WIDTH||getX()<=0) 
			setXSpeed(getXSpeed()*-1);
		if (getY()+getRad()>=HEIGHT||getY()<=0) 
			setYSpeed(getYSpeed()*-1);
		super.move();
	}
}
