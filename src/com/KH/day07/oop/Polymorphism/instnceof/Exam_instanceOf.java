package com.KH.day07.oop.Polymorphism.instnceof;

public class Exam_instanceOf {
		//person = new Student () 로 초기화
		//person = new Researcher () 로 초기화
		//person = new StudentWorker()로 초기화
		//person = new Professor() 로 초기화 
	static void print(Person person) {
		if(person instanceof Student) {			
			System.out.println("Student입니다.");
		}if(person instanceof Researcher) {
			System.out.println("Researcher입니다.");
		}if (person instanceof StudentWorker) {
			System.out.println("StudentWorker 입니다.");
		}if(person instanceof Professor) { 
			System.out.println("Professor입니다.");
		}
	}
//	static void print(Researcher researcher) {
//		System.out.println("Reasearcher입니다.");
//	}instanceof 란 현재 상속 부모로 부터 파생된 자식 클래스를 진단하여 화면상에 구현해준다.
//	static void print(StudentWorker worker) {
//		System.out.println("StudentWorker입니다.");
//
//	};
//	static void print(Professor professor) {
//		System.out.println("Professor입니다.");
//
//	};
	public static void main(String[] args) {
		print(new Student());
		print(new Researcher());
		print(new StudentWorker());
		print(new Professor());
	}

}
