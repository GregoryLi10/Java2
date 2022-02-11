package Ball;

import java.awt.Color;

public class SineBall extends BouncingBall{

	public SineBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
	}
	
	public void move() {
		setX(getX()+getXSpeed()/4);
		setY((int) (Math.sin(getX()/20.0)*70+HEIGHT/2));
		super.move();
	}

}
