package com.KH.day18.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.KH.day18.music.controller.MusicController;
import com.KH.day18.music.model.vo.Music;

public class MusicView {
	private MusicController mController;
	Music music = null;
	List<Music>mlist = null;
	String singer = null;

	public MusicView() {
		mController = new MusicController();
		music = new Music();
	}
	public void startProgram() {
		int index =0; 
		end: 
			while(true) {
				int choice = createMenu();
				switch(choice) {			
				case 1 : music = inputMusic();
						mController.addMusic(music);
				break;
				case 2 : 
					singer = singername();
					index = mController.findindexInfo(singer);
					if(index != -1) {
						
						music = mController.musicBysinger(singer);
						mController.modifyMusic(index,music);
					}
					break;
				case 3 : 
					singer = singername();
					index = mController.findindexInfo(singer);
					if(index != -1) {
						
						mController.deleteMusic(index);
					}
					
					break;
				case 4 : 
					 singer = singername(); 
					mlist 
					=
							mController.allsingerInfo(singer);
					printAllMusics(mlist);
					break;
				case 5 : 
					List<Music> mList = mController.allMusicInfo();
					printAllMusics(mList);
					break ;				
				case 6 : break end;				
			
				
				}
				
			}
		
		
	}
	private void printAllMusics(List<Music> mList) {
		for(int i =0 ; i < mList.size() ; i++) {
			mList.get(i);
			System.out.printf("%d 번 째 곡 타이틀 : %s / 가수 : %s",(i+1),music.getTitle(),music.getSinger());
		}
		
	}

	private Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("=======음악 정보 등록=========");
		System.out.println("곡 명 입력");
		String title = sc.nextLine();
		System.out.println("가수 입력");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		return music;
	}
	public int createMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("========음악 관리 프로그램=========");
		System.out.println("1. 음악 등록");
		System.out.println("2. 음악 정보 수정");
		System.out.println("3. 음악 정보 삭제");
		System.out.println("4. 음악 정보 출력(가수명)");
		System.out.println("5. 음악 정보 전체 출력");
		System.out.println("6. 프로그램 종료 ");
		System.out.print("7. 선택 : ");
		System.out.println();
		int choice = sc.nextInt();
		return choice;
		
	}
	public String singername() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가수 명 입력:");
		String name= sc.nextLine();
		return  name;
	}
	
private Music modifyMusic (Music music) {
	Scanner sc = new Scanner(System.in);
	System.out.print("곡명:");
	String title = sc.nextLine();
	System.out.print("가수명:");
	String Singer = sc.nextLine();
	music.setTitle(title);
	music.setSinger(Singer);
	return music;
}
	
}
