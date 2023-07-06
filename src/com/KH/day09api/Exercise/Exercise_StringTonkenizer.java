package com.KH.day09api.Exercise;

import java.util.StringTokenizer;

public class Exercise_StringTonkenizer {

	public static void main(String[] args) {
		//홍길동 /장화/홍련/콩쥐 팥쥐의 문자열 데이터를
		// '/'기준으로 잘라서 홍련만 출력하세요
		String date ="홍길동/장화/홍련/콩쥐";
		StringTokenizer ty = new StringTokenizer(date,"/");
		while(ty.hasMoreElements()) {
			if(ty.nextToken().equals("홍련")) {
				System.out.println("홍련");
		}
		}

		}
		
	}


