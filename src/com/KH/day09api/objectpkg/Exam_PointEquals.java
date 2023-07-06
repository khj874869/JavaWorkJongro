package com.KH.day09api.objectpkg;

class Point1{
	int x,y;
	public Point1() {}

public Point1(int x, int y) {
	this.x = x;
	this.y = y;
}
@Override
public boolean equals(Object obj) {
	Point1 p = (Point1)obj;
	if(x == p.x&&y==p.y) {
		return true;
	}else {
		return false;
	}
}
}


public class Exam_PointEquals {
	//Point 클래스에 두점의 좌표가 같으면
	// true를 리턴하는 equals ()를 작성하고
	//2,3포인트 객체와 2,3 포인트 객체가
	//같은지 출력하시오
	//같을 때
	//좌표가 같습니다.
	//다를때 
	//좌표가 다릅니다.
	public static void main(String[] args) {
		
		Point1 point1 = new Point1(3,2);
		Point1 point2 = new Point1(3,2);
		if(point1.equals(point2)) {
			System.out.print("좌표가 같습니다.");
		}else
		{
			System.out.println("좌표가 다릅니다.");
		}
	}
	
}
