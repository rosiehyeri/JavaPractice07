package com.javaex.ex01;

public abstract class Shape {
	
	protected String fillColor;
	
	public abstract void draw();
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	
}


