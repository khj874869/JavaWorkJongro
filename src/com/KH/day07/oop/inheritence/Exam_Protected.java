package com.KH.day07.oop.inheritence;

import com.KH.day07.oop.Point.Point;

class parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public parent() {
		
	}
}
class child extends parent {
private int childMoney;
public child() {}
void set() {
	super.pub=1;
	super.pro=2;
	super.def=3;
//	super.pri; //The field parent.pri is not visible	
}
}
class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {
		
	}
	void set() {
		super.pub =1 ;
//		super.def =2 ; //The field point.def is not visible
		super.pro =3; 
//		super.pri = 4;//The field point.pri is not visible 
	}
}

public class Exam_Protected {
public static void main(String[] args) {
	
}
}
