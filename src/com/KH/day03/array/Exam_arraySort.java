package com.KH.day03.array;

public class Exam_arraySort {
	public static void main(String [] args)
	{
		//{1,3,6,10,4,5,7,5,2,9,8}
		// -> {1,~
		//정렬 알고리즘의 종류
		//1. 삽입정렬
		//2. 선택정렬
		//3. 버블정렬
		//4. 퀵정렬
		//5. .............
		int num1 = 5;
		int num2 = 15;		
		System.out.printf("num1 : %d,num2 : %d\n", num1, num2);
//		int temp = num1; // temp : 5
		num1 = num2 ; // num1 : 15
//		num2 = temp; // num2 : 15 둘을 바꿀 때는 임시 변수가 필요함 하나의 값이
		//다른 곳에서 쓰일 경우에 메모리 상에서 없어지기에 
		//두 개의 자리를 바꿀 때에는 반드시 임시변수가 필요함
		System.out.printf("num1 : %d,num2 : %d\n", num1, num2);

		int [] num =  {2,1,3};
		int temp = 0;
		temp = num[0];
		num[0] =num[2];
		num[2]  =temp ;
		
		temp =num[1];
		num[1] =num[2];
		num[2] = temp;
 		for(int i =0 ; i<num.length ; i++) {			
				System.out.print(num[i] + " ");			
		}
	}
}
