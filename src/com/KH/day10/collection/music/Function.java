package com.KH.day10.collection.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Function {
	Map<String,Album> map = new HashMap<String,Album>();
	List<Album> list; 
	public Function () {
		list = new ArrayList<Album>();
	}
	public int printmenu() {

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
	public void inputLastSing() {
		Scanner sc = new Scanner(System.in);
		System.out.print("노래 제목을 입력하세요 : ");
		String singname = sc.nextLine();
		System.out.print("가수 이름을 입력하세요 :");
		String singer = sc.nextLine();
		Album album = new Album(singname,singer);
		list.add(album);
	}
	public void inputFirstSing() {
		Scanner sc = new Scanner(System.in);
		System.out.print("노래 제목을 입력하세요 : ");
		String singname = sc.nextLine();
		System.out.print("가수 이름을 입력하세요 :");
		String singer = sc.nextLine();
		Album album = new Album(singname,singer);
		list.add(0,album);
	}
	
	public void full() {
		for(int i =0 ; i<list.size(); i++) {
			Album album = list.get(i);
			System.out.printf("%d 번째 노래 ->곡명:%s, 가수명 : %s : " , (i+1),album.getsingname(),album.getsinger());
			
		}
	}
	//곡명으로 음악 검색
	public void specify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 곡 입력");
		String singname = sc.nextLine();
		for(Album album : list) {
			if(album.getsingname().equals(singname) ) {
				System.out.printf("검색 결과 : 노래 ->곡명:%s, 가수명 : %s : " ,album.getsingname(),album.getsinger());
				break;//그만
			}
			
	
		}
	}
		public void delete() {
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 곡 입력 : ");
			String singname= sc.nextLine();
			for(int i =0;i<list.size();i++) {
				Album album = list.get(i);
				if(album.getsingname().equals(singname)) {
					list.remove(i);//삭제
					break;
				}
			}
		}
		//수정할 곡 입력하기
		public void update() {
			Scanner sc = new Scanner(System.in);
			System.out.println("수정할 곡 입력 : ");
			String singname= sc.nextLine();
			System.out.println("수정할 정보 입력(곡명) : ");
			String modTitle = sc.nextLine();
			System.out.println("수정할 정보 입력(곡명) : ");
			String modSinger = sc.nextLine();
			Album modalbum = new Album(modTitle,modSinger);
			for(int i =0;i<list.size();i++) {
				Album album = list.get(i);
				if(album.getsingname().equals(singname)) {
					list.set(i,album);//삭제
					break;
				}
			}
		}
}