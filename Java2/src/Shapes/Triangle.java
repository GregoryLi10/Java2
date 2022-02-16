package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape{
	private int width, height;
	public Triangle(int startx, int starty, int width, int height) {
		super(startx, starty);
		this.width=width;
		this.height=height;
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(25, 150, 125));
		g.fillPolygon(new int[]{getX(), getX(), getX()+width}, new int[]{getY(), getY()+height, getY()+height}, 3);
	}

}
