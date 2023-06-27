package com.KH.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		//구구단 출력
		for(int h = 1 ; h<10 ; h++) {
		for(int k =2 ; k<10 ;k++)  {
			System.out.print(k+"*" + h  + "=" + k*h + "\t");
		}
		System.out.println();
		}
	}
}
