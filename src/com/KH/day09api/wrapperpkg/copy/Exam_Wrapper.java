package com.KH.day09api.wrapperpkg.copy;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		Integer su =  Integer.valueOf(0);//static메소드가 기울어진 것들은 전부
		//The construction Integer(Int) has been deprecated since version 9 and marked for removal
//		su = new Integer(0);
//		su = null;   
		//boxing and unboxing
		su = Integer.valueOf(1026);
		su = 1026; // 오토 박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토 언 박싱 
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '4' , c2 = 'F';
			if(Character.isDigit(c1)) {
				System.out.println(c1 + "은 숫자");
				
			}
			if(Character.isAlphabetic(c2)) {
				System.out.println(c2 + "은 문자");
			}
	}

}
