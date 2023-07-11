package com.KH.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.KH.day12.music.model.vo.Music;
import com.KH.day12.music.view.MusicView;

public class MusicController {
	List<Music> mList;
	public MusicController() {
		mList = new ArrayList<Music>();
		
	}
	/** 자바 doc 문서를 따로 만들 수 있음
	 *마지막 위치에 곡 추가 
	 * @param music
	 */
	public void addAtLast(Music music) {		
		mList.add(music);
	}
	public void AddatFirst(Music music) {
		mList.add(0,music);
	}
	/** 
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	public List<Music> printMusicList(){
		return mList;
	}
	public List<Music> searchMusicsByName(String title){
		//찾을 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		//기존 음악이 있는 m 리스트 찾기
		for(Music mOne : mList) {
			//입력한 이름이 같으면
			if(mOne.getTitle().equals(title)) {
				//findList에 추가하기
				findList.add(mOne);
			}
		}
		return findList;
	}
	public int searchOneBytitle(String title) {
		for(int i =0;i< mList.size();i++) {
			Music music =  mList.get(i);
			if(music.getTitle().equals(title)) {
				return i; //삭제하면 나오기
			}
	}
		return -1;
	}
	
	public void removeMusic(int i ) {
			//mList에서 삭제
				mList.remove(i);//삭제
		
			}
	public void updateMusic(int index,Music music) 
	{
		mList.set(index,music)	;		
}
	public void sortByTitleASC() {
		for(int i =0; i<mList.size()-1; i++) {
			for(int j =0; j<(mList.size()-1)-i;j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//The operator > is undefined for the argument type(s) 
				//java.lang.String, java.lang.String
				//결과값이 0이면 동일하고
				//양수값이면 왼쪽의 순서가 더 크다.
				//음수값이면 왼쪽의 순서가 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);	
				}
			}
		}
		}
	public void sortByTitleDESC() {
		for(int i=1;  i<mList.size()-1; i++) {
			for(int j=0 ; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);	
				}
			}
			
		}
	}
	public void sortBysingerASC() {
		for(int i =0; i<mList.size()-1; i++) {
			for(int j =0; j<(mList.size()-1)-i;j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				//The operator > is undefined for the argument type(s) 
				//java.lang.String, java.lang.String
				//결과값이 0이면 동일하고
				//양수값이면 왼쪽의 순서가 더 크다.
				//음수값이면 왼쪽의 순서가 작음
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);	
				}
			}
		}
	}
	public void sortBysingerDESC() {
		for(int i=1;  i<mList.size()-1; i++) {
			for(int j=0 ; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);	
				}
			}
	}
	
	}
	}
