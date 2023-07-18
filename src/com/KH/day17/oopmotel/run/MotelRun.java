package com.KH.day17.oopmotel.run;

import java.util.Scanner;

import com.KH.day17.oopmotel.controller.RoomController;
import com.KH.day17.oopmotel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) throws InterruptedException {
		MotelView view = new MotelView();
		RoomController mt = new RoomController();
		Scanner sc = new Scanner(System.in);
		boolean [] rooms = new boolean[10];
		end : 
		while(true) {
		
			int choice = view.printMenu();
			int chosenRoom = 0;
			switch(choice) {
			case 1 : 
				chosenRoom = view.inputRoomNumber("입실");
				mt.checkIn(chosenRoom);
				Thread.sleep(500);
				break;
			case 2 : 
				chosenRoom = view.inputRoomNumber("퇴실");
				mt.checkOut(chosenRoom);
				break;
			case 3 : 
				mt.printRoom();
				Thread.sleep(2000);
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
