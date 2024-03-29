package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");
		 // 추상 클래스인 Shape은 직접 객체를 생성할 수 없습니다.
        // 따라서 Shape s = new Shape("빨강"); 코드는 사용할 수 없습니다.
        // 대신 하위 클래스를 이용하여 객체를 생성합니다.
		
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		
		// Shape 클래스의 추상 메서드인 draw()는 하위 클래스에서 오버라이드 되어야 합니다.
        // sr1 객체의 draw() 메서드를 호출하여 해당 도형을 그립니다.
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		
		//아래 코드는 새로 추가한 것
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		int width = ((Ractangle) sr1).getWidth();
		System.out.println("sr1의 가로는: " + width + "입니다.");
		
	}
}

	
	