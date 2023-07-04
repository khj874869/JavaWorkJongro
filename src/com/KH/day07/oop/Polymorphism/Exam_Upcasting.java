package com.KH.day07.oop.Polymorphism;

public class Exam_Upcasting {
	public static void main(String[] args) {
		Student std = new Student();
		Person p = new Person();
		
		Person parent = new Student("일용자");
		//업
		System.out.println(parent.name);
		System.out.println(parent.Id);
		//다운
		System.out.println(((Student)parent).grade);

		System.out.println(((Student)parent).department);

	}
}
