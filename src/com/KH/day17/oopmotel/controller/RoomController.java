package com.KH.day17.oopmotel.controller;

import java.util.ArrayList;
import java.util.List;

import com.KH.day17.oopmotel.vo.MotelVo;

public class RoomController {
	
	List<Boolean> rlist ;
	public RoomController() {
		rlist = new ArrayList<Boolean>();
		for(int i =0; i<10;i++) {
			rlist.add(false);
		}
	}
	public void checkIn(int roomNo) {
		if(roomNo > 0 && roomNo <= 10) {
			Boolean mv = rlist.get(roomNo-1);
//			if(!mv.isAvailable()) {
			if(!mv) {
			rlist.set(roomNo-1, true);	
			System.out.println(roomNo + "번 방에 입실하셨습니다.");
			}else {
				System.out.println(roomNo + "번방은 현재 손님이 있습니다.");
			}
			try {
				Thread.sleep(250);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
		}
	}
	public void checkOut(int roomNo) throws InterruptedException {
		if(roomNo > 0 && roomNo <= 10) {
			Boolean mv = rlist.get(roomNo-1);
			if(!mv) {
				rlist.set(roomNo-1, false);	
				System.out.println(roomNo + "번 방에 퇴실하셨습니다.");
			}else {
				System.out.println(roomNo + "번방은 현재 빈 방입니다.");
			}
			Thread.sleep(500);
		}else {
			System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
		}
	}
	public void printRoom() {
		for(int i =0; i<rlist.size();i++) {
			if(!rlist.get(i))
				System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
			else
				System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
		}
	}
}
