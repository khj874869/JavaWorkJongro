package com.KH.day01.typeTrance;

public class Exam_TypeTrans01 {
	public static void main(String [] args) 
	{
		 //int * int , double + double = double 
		//int + double = > 자동 형변환
		int iNum =10;
		double dNum = 3.14;
		double result = dNum + iNum; // iNum 의 10이 10.0으로 자동 형변환
		System.out.println("result :" + result);
		System.out.println("강제 형 변환 :" + (int)result);
		System.out.println("강제 형 변환2 :" + (char)65);
	}
}
