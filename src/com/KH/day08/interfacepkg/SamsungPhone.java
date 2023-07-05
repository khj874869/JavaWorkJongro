package com.KH.day08.interfacepkg;
//The type PhoneInterface cannot be the superclass
public class SamsungPhone implements  PhoneInterface{

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("뚜루루루루루루루룰루루루");
	}

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("========================SAMSUNG====================");
	}
//The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()

}
