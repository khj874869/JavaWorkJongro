package com.KH.day02.basic;

public class Exam_PrintSample {
	public static void main(String [] args)
	{
		System.out.println("ㄱㅐ행이 포함된 출력 메소드");
		System.out.print("개행이 포함되지 않은 메소드");
		System.out.println("<-바로 옆으로 붙어 버림");
		
		//%d : 정수 , \n은 개행이다. %s : 문자열 %c:문자 
		//\t는 탭 크기 만큼 띄우는거다.
		
		System.out.printf("정수 출력: %d\n", 11);
		System.out.printf("실수 출력 : %.3f\n",10.26);
		System.out.printf("문자열 출력 : %s","자바 printf 문자열 출력");
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 입니다.%b\n", 'F',"공공데이터개발자"
				,5.15,12.26,true);
	}
}
