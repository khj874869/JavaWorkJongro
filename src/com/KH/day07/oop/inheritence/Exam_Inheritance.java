package com.KH.day07.oop.inheritence;

import com.KH.day07.oop.Point.ColorPoint;
import com.KH.day07.oop.Point.Point;

public class Exam_Inheritance {

	public int pub;
	int def;
	protected int pro;
	private int pri;			
	public static void main(String[] args) {
		//(x,y,)한 점을 표현하는 Point크랠스와 이를 상속받아 색을 가진 점을 표현하는
		//ColorPoint클래스를 만들고 활용해보자
	Point p = new Point(1,2);
//	p.set(1,2);
	p.showPoint();
	ColorPoint cp = new ColorPoint(3,4,"red");
//	cp.set(3, 4);
	cp.setColor("red");
	cp.showColorPoint();
	ColorPoint cp2 = new ColorPoint(5,6,"blue");
	cp2.showColorPoint();
		

}	
	}
	
