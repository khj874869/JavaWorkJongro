package com.KH.day03.array;

public class Exam_Array {
	public static void main(String  [] args)
	{
		int num;
		num = 0;
		//int num = 0; 
		int nums []; //int [] nums; 배열 선언
		nums = new int[10];
		//nums 주소이다. [] 연산이고 숫자가 들어가는 것은
		// 주소에 값이 붙는다. 주소는 0부터 시작하며,
		//값은 0번째 부터 n번째까지 늘어난다.
		//배열은 할당 후 초기화하지 않으면 자료형의 기본값이 들어간다.
		//int의 기본값은 0이다. String 은 null값이 들어간다.
		
		nums[0] = 2; //값 초기화 
		System.out.println(nums[0]);
		System.out.println("배열의 크기    :" + nums.length);
		for(int i = 0 ; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
