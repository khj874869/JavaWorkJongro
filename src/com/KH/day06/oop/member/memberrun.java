package com.KH.day06.oop.member;

public class memberrun {

//입력 받을 거 3개와
	//캡슐화의 원칙 
	private String name = " ";
	private int money = 0;
	private int charge = 0;
public void run(String name, int money, int charge) {
	this.name = name;
	this.money = money;
	this.charge = charge;
}
public double getsum() {
	 double sum = (double)(money*charge)/3;
	 return sum;
}
public String getName() {
	return this.name;
}
public int getmoney() {
	return this.money;
}
public int getCharge() {
	return this.charge;
}
public void setName(String name) {
	this.name = name;
}
public void setmoney(int money) {
	this.money = money;
}
public void setcharge(int charge) {
	this.charge = charge;
}
}
