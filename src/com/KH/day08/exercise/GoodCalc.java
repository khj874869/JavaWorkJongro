package com.KH.day08.exercise;

import java.util.Scanner;

public class GoodCalc extends Caculator{

	@Override
	public int add(int a, int b) {
		//a+b
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i =0 ; i<a.length ; i++) {
			sum += a[i];
		}
		double avg = sum /(double)a.length;
		return avg;
	}
	


}
