package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	
	//아래 코드는 다 새로 추가했음
	// 가로 크기를 반환하는 getWidth() 메서드 추가
    public int getWidth() {
        return width;
    }

    // 세로 크기를 반환하는 getHeight() 메서드 추가
    public int getHeight() {
        return height;
    }

}


