package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape{
	private int width, height;
	public Oval(int startx, int starty, int width, int height) {
		super(startx, starty);
		this.width=width;
		this.height=height;
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(0, 0, 175));
		g.fillOval(getX(), getY(), width, height);
	}

}
