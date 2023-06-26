package com.KH.day01.operation;

public class Exam_unary {
	public static void main(String[] args)
	{
	//단항 연산자
//	int a = 1;
//	int x = 100;
//	System.out.println(x--);
	//a++, ++a -> a= a+1;
//	System.out.println(a++);//후위 연산
//	System.out.println(++a);//전위 연산 
	//a가 3인 상태
//	System.out.println(a);
	//문제1
	int a = 10;
	int b = 20;
	int c = 30;
	 a++;
	 //a:11,b:20,c:30;
	 b=(--a) + b;
	// a: 10, b: 30 , c: 30;
	 c = (a++)+(--b);
	 //a : 11 , c : 39 , b : 29;
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);
	 System.out.println("c : " + c);
	 
	 boolean flag = true;
	 System.out.println(!!!!flag);
	 int x = 100;
	 int y = 33;
	 int z = 0 ;
	 
	 x--;
	 //x : 99 , y :33 , z: 0;
	 z = x-- + --y;
	 //z= x 99 + 32 = 131 ;
	 //x=98 y:32
	 x = 99 + x++ + x;//99+98+99
	 //x= 296
	 y= y-- + y + ++y; //32 + 31 + 32 
	 // x = 206, y : 95 , z :131
	 System.out.println("x : " + x + ", y : " +y + ",z : "+ z);
	
	
	
	}
}
