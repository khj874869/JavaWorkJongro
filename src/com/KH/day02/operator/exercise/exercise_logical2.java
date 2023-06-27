package com.KH.day02.operator.exercise;
import java.io.IOException;
import java.util.Scanner;
public class exercise_logical2 {
	public static void main(String [] args)
	{
		//입력받은 문자가 대 소문자인지 구별하세요.
		//변수 word
		//영어 대문자 확인 : True
		Scanner sc = new Scanner(System.in);
		System.out.print("대 소문자를 입력해주세요.:");
		char word = sc.next().charAt(0);
		//문자열에서 첫번째 인덱스 값을 자르니까 문자가 된다.
		boolean result = (word>=65) &&(word<=90);
		System.out.println("대문자입니까?" +result);
		boolean result1 = (word>='a')&&(word<='z');
		System.out.println("소문자입니까?"+result1);
		
		
				}
}
