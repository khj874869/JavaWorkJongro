package com.KH.day02.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args)
	{
		//math.random(0,1)
		Random rand = new Random();
		for(int i = 0 ; i <10 ; i++) {
			//nextInt(n) -> o부터 n-1까지의 랜덤한 수 리턴
		System.out.println(rand.nextInt(11)+25);
		// 1부터 10까지의 수를 랜덤한 값을 출력하고 싶다.
		// 0부터 9까지 -> nextInt (10)
		// 1부터 10까지 -> nextInt(10)+1
		//25부터 35 까지의 랜덤한 수 출력하기
		//0부터 10사이 -> nextInt(11)
		// 25부터 35 -> nextInt(11)+25;
		}
	}
}
