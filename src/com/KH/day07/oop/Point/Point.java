package com.KH.day07.oop.Point;

import com.KH.day07.oop.inheritence.Exam_Inheritance;

public class Point extends Exam_Inheritance   {
	public int pub;
	int def;
	protected int pro;
	private int pri;			
		//(x,y,)한 점을 표현하는 Point크랠스와 이를 상속받아 색을 가진 점을 표현하는
		//ColorPoint클래스를 만들고 활용해보자
	private int x,y ;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.printf("%d,%d\n",x,y);
	}
}	

