package com.KH.day09api.javaapi;



public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello java";
		msg = new String("Hello java");
		//내용 비교가 필요 왜냐하면 new 가 새로운 주소를 할당하기 때문임

		String data1 = new String(" C#");//띄어쓰기도 카운팅한다. length에선 배열과 다르게 소괄호도 붙인다.
		String data2 = new String(",C++");
		System.out.print(data1+"의 길이는"+data1.length());
		System.out.println(data2+"의 길이는 "+data2.length());
		
		
		
		//문자열 포함
	
		System.out.println("#이 있는가? : " + data1.contains("#"));	
		//문자열 연결
		data1= data1.concat(data2);
		System.out.println("문자열 연결 : " + data1.concat(data2));
		//공백제거
		data1 = data1.trim();
		System.out.println("문자열 공백 제거 :" + data1);		
		//문자열 교체
		data1 = data1.replace("C#","JAVA");
		System.out.println("문자열 교체 :" + data1);
		//문자열 분리
		String [] words = data1.split(",");
		for(int i=0 ; i<words.length; i++) {
			System.out.println("문자열 분리 :" + words[i]);		
		}
		//문자열 자르기
		//JAVA,C++
		data1 = data1.substring(0,4);
		System.out.println("문자열 자르기 :" + data1);
		char word =data1.charAt(3);
		System.out.println("String 으로 부터 문자 자르기 " + word);		
	}
}

