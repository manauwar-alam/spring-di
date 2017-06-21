package com.manauwar.spring.brains;

import java.util.List;

public class TriangleUsingList {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw()
	{
		
		System.out.println("Printing using list of points of Triangle");
		for(Point point :points)
		{
			System.out.println("Point A = ("+point.getX()+","+point.getY()+")");
		}
		
	}
	
}
