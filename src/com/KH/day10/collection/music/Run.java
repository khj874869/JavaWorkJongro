package com.KH.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Function fc = new Function();
		Scanner sc =new Scanner(System.in);
		finish:
			while(true) {
			int value = fc.printmenu();
				switch(value) {
				case 1 : fc.inputLastSing()  ; break;
				case 2 : fc.inputFirstSing() ; break;
				case 3 : fc.full(); break;
				case 4 : fc.specify() ; break;
				case 5 : fc.delete(); break;
				case 6 : fc.update(); break;
				case 0 : System.out.print("0. 종료") ; break finish;
				default : System.out.println("잘못입력");break;
				}
			
		}
		
	}
}
