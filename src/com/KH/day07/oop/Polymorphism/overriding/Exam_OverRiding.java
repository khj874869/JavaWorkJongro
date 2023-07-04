package com.KH.day07.oop.Polymorphism.overriding;

public class Exam_OverRiding {
	//1.오버라이딩은 상속관계에서 사용 가능하다.
	//2.오버라이딩은 다 똑같고 실행문만 다르다.
	//3. 오버라이딩이 되면 동적 바인딩이 되어 다형성을 이용할 수 있다.
	static void paint(Shape shape) {
		shape.draw();  //업 캐스팅에 의해 슈퍼 클래스 래퍼런스로 오버라이딩 된 메소드 호출
					   //동적 바인딩 
	}
	//	static void paint(Line line) {
//		line.draw();
//	}
//	static void paint(circle Circle) {
//		Circle.draw();
//	}
//	static void paint(Rect rect) {
//		rect.draw();
//	}
	public static void main(String[] args) {
		paint(new Line());
		paint(new circle());
		paint(new Rect());
		//		Line line = new Line();
//		line.draw();
//		circle Circle = new circle();
//		Circle.draw();
//		Rect rect = new Rect();
//		rect.draw();
	}

}
