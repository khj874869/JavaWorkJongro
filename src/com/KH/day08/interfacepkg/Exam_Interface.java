package com.KH.day08.interfacepkg;

public class Exam_Interface {
public static void main(String[] args) {
	PhoneInterface phone = new SamsungPhone(); 
	//1.Cannot instantiate the type PhoneInterface
	//=> 인터페이스 객체로 생성 불가능
	phone.sendCall();
	phone.receiveCall();
	phone.printLogo();
}
}
