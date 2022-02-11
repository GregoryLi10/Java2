package Ball;

import java.awt.Color;

public class ColorBall extends Ball{
	private int c=0;
	public ColorBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
	}
	
	public void move() {
		super.move();
		c++;
		if (c%20!=0) return;
		setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
	}
}
