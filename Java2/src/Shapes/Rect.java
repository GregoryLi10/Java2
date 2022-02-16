package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape{
	private int width, height;
	public Rect(int startx, int starty, int width, int height) {
		super(startx, starty);
		this.width=width;
		this.height=height;
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(100, 0, 175));
		g.fillRect(getX(), getY(), width, height);
	}
}
