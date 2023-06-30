package com.KH.day05.oop;

class sample{
	public int a; // 모든 곳에서 사용 가능
	private int b;//같은 클래스 내에서만 사용 가능
	int c ; //default; 같은 패키지에서만 사용 가능
}


public class Exam_access 
{
	public static void main (String [] args)
	{
	sample sample =new sample();
	sample.a = 5;
//	sample.b =3 ; //멤버변수 b는 private 이기 때문에 보이지 않아 접근 할 수 없습니다.
	sample.c = 10;   // default 는 접근 가능한테 같은 패키지 여서 가능하다.
	}
}
