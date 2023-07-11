package com.KH.day12.music.view;

import java.util.List;
import java.util.Scanner;

import com.KH.day12.music.model.vo.Music;

public class MusicView {
	
	public int musicMenu() {
		System.out.println("======메인메뉴======");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >>");
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 >>");
		int select1 = sc.nextInt();
		return select1;
	}
	public Music inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		return music;
		
	}
	public Music inputFirstSing() {
		Scanner sc = new Scanner(System.in);
		System.out.print("노래 제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("가수 이름을 입력하세요 :");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		return music;
	}
	public void displaySuccess() {
		System.out.println("[서비스 성공] 마지막 위치에 추가 성공.");
	}
	public void disFirstplaySuccess() {
		System.out.println("[서비스 성공] 첫번째 위치에 추가 성공.");
	}
	public void showAllMusicList(List<Music> allList) {		
		System.out.println("전체 곡 목록 출력");
		int count =1; 
		for(Music music : allList) {
			System.out.printf("%d 번째 노래 ->곡명:%s, 가수명 : %s : " , 
					count++,
					music.getTitle(),music.getSinger());
			
		}
		System.out.println();
	
		}
	public String showSpecifyMusic(String category){
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 곡 입력 : ");
		String title = sc.nextLine();
		return title;
	}
	public void dispalySuccess(String msg) {
		System.out.println("[서비스 성공]" + msg);
	}
	public void printMessage(String message) {
		System.out.println(message);
	}
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title,singer);
		return music;
	}
	
	
	}
	

