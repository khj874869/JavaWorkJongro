package com.KH.day07.oop.Polymorphism.overloading;
class Weapon{
	public Weapon() {
		
	}
	public void Weapon(int value) {
		System.out.print(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " ," + name);
	}
	
}
	public class Exam_OverLoading {
		public static void main(String[] args) {
			System.out.println(1);
			System.out.println(1.1);
			System.out.println('A');
			System.out.println("Hello java");
			System.out.println(true);
		}
}
