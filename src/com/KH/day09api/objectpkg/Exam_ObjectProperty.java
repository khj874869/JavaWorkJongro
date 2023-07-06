package com.KH.day09api.objectpkg;

public class Exam_ObjectProperty {

public static void print(Object obj) {
System.out.println("클래스 이름 :" + obj.getClass().getName());
System.out.println("해시 코드 값 : " + obj.hashCode());
System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
System.out.println("객체 출력 : " + obj);
	}
	public static void main(String[] args) {
//		Point p = new Point(2,3); //new 선언 Point 객체의 2,3 번째 주소 할당 
//		Point p2 = new Point(4,5);
//			print(p);
//			print(p2);
			String javaStr = "java";
			String javaStr2 = "java";
			String javaStr3 = new String("java");
			String [] strArrs = new String[10];
			strArrs[0] = "java";
			strArrs[1] = "java";
			//Object 클래스의 equals () 메소드 : 내용비교 
//			if(javaStr == "java") { 
//			if(javaStr == "java") {
//			if(javaStr == javaStr3) {
//			if(strArrs[0]==strArrs[1]) {
			if(javaStr.equals(javaStr3)) {
				System.out.println("같습니다.");
			}else {
				System.out.println("다릅니다.");
			}
	}	

}
