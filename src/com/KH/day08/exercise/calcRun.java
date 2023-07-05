package com.KH.day08.exercise;

public class calcRun {
	public static void main(String[] args) {
//		Caculator calc = new Caculator();
	
		Caculator calc = new GoodCalc(); //업캐스팅
		//추상클래스는 객체 생성이 안됨.
		//Cannot instantiate the type Caculator 
		int [] a = {1,2,3,4,5};
		System.out.printf("평균 : %.2f ", calc.average(a));
	}
}
