package com.manauwar.spring.brains;

public class Triangle_old {
	
	private String type;
	private int height;
	
	public Triangle_old(String type)
	{
		this.type =  type;
	}
	
	
	public Triangle_old(int height) 
	{
		this.height = height;
	}


	public Triangle_old(String type, int height)
	{
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw()
	{
		System.out.println(getType()+" Triangle drawn of heignt : "+getHeight());
	}
}
