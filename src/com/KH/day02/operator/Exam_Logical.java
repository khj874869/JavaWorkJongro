package com.KH.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) 
	{
		System.out.println("논리 연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result1,result2,result3,result4;
		//남자이면서 평균평점 4.3이상인 사람
		//컴퓨터 공학과 또는 경영학과인 사람
		result1 = (num1==num2)&&(num1<num2);//false
		result2 = (num1<num2)||(num1==num2);//false
		result3 = (num1>num2)&&(num1 != num2);//true
		result4 = (num1>num2) || (num1==num2); //true
		System.out.println("result 1의 결과값 :" + result1 );
		System.out.println("result 2의 결과값 :" + result2 );
		System.out.println("result 3의 결과값 :" + result3 );
		System.out.println("result 4의 결과값 :" + result4 );
	
	//연습문제 1번-2 
		int aNum =70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ <100 );
		System.out.println("aNum:" + aNum +", bNum의 값:" + bNum);
		//**&&의 경우 앞이 false면 뒤는 계산하지 않는다.
		//result1= true 				a= 71,b=55
		result2 = (aNum == bNum )&& (--bNum <55);
		System.out.println("aNum:" + aNum +", bNum의 값:" + bNum);

		//result2 = false aNum :71 bnum :54
		result3 = (aNum != bNum)&& (bNum-- <aNum++);
		System.out.println("aNum:" + aNum +", bNum의 값:" + bNum);
		//**||의 경우 앞이 true면 뒤는 계산하지 않는다.
		//aNum:72 bNum:53 result3 : true 
		result4 = (aNum++ != bNum) || (bNum++ >=85);
		//aNum : 73 bNum : 54 result : true 
		System.out.println("aNum:" + aNum +", bNum의 값:" + bNum);
	}
	
}
