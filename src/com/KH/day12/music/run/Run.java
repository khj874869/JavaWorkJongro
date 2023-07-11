package com.KH.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.KH.day12.music.controller.MusicController;
import com.KH.day12.music.model.vo.Music;
import com.KH.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mc = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		String title;
		int index;
		do {
			choice = view.musicMenu();
			switch(choice) {
			case 1 :  
				//MusicFunction -> MusicView, Musiccontroller
				music = view.inputMusicInfo();
				mc.addAtLast(music);
				view.displaySuccess();
				break;
			case 2 :  
				music = view.inputFirstSing();
				mc.AddatFirst(music);
				view.disFirstplaySuccess();
				break;
			case 3 :
			List<Music> allList = mc.printMusicList();
			view.showAllMusicList(allList);
			view.displaySuccess();  ;break;
			case 4 :
				 title = view.showSpecifyMusic("검색");
				List<Music> searchList = mc.searchMusicsByName(title);
				view.dispalySuccess("검색한" + title);
				view.showAllMusicList(searchList);
				break;
			case 5 : 
				 title = view.showSpecifyMusic("삭제");
				  index= mc.searchOneBytitle(title);
				 if(index == -1) {
					 view.dispalySuccess("존재하지 않습니다.");
					 break;					 		
				 }
				 mc.removeMusic(index);
				view.dispalySuccess("곡 삭제 성공!");
				;break;
			case 6 : 
				//수정할 곡 입력 받기
				title = view.showSpecifyMusic("수정");
				//존재여부 확인
				index = mc.searchOneBytitle(title);
				if(index ==-1) {
					view.dispalySuccess("존재하지 않습니다.");
					break;
				}
				//이후 수정 하기
				//수정할 정보 입력 받기
				music=view.modifyMusicInfo();
				//수정하기
				mc.updateMusic(index,music);
				;break;
			case 7 : 
				view.printMessage("===========곡명 오름차순 정렬============");
				mc.sortByTitleASC();
				view.dispalySuccess("오름차순 정렬 성공! 3번을 눌러 출력해주세요!");
				
				break;
			case 8 : 
				view.printMessage("=============곡명 내림차순 정렬=================");
				mc.sortByTitleDESC();
				view.dispalySuccess("내림차순 성공!!!!! 3번을 눌러 출력해주세요!");
				;break;
			case 9 : 
				view.printMessage("=============가수명 오름차순 정렬================");
				mc.sortBysingerASC();
				view.dispalySuccess("오름차순 성공!! 3번을 눌러 출력해주세요.");
				;break;
			case 10 : 
				view.printMessage("=============가수명 내림차순 정렬================");
				mc.sortBysingerDESC();
				view.dispalySuccess("내림차순 성공!! 3번을 눌러 출력해주세요.");

				;break;
			case 0 :  view.printMessage("프로그램을 종료합니다.");break;
			default : 
				view.printMessage("잘못 입력하셨습니다.");break;
			}
		}while(choice !=0);
	}
}
