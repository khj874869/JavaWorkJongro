package com.KH.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.KH.day18.music.model.vo.Music;

public class MusicDAO {
	private List<Music> musiclist;
	private Music music;
	public MusicDAO() {
		musiclist = new ArrayList<Music>();
		music = new Music();
	
	}
	public void Musicadd(Music muse) {
		musiclist.add(muse);
	}
	public List<Music> musicinfo() {
		return musiclist;
	}
	public List<Music> singerinfo(String singer){
		List<Music> findlist = new ArrayList<Music>();
		for(Music music : musiclist) {
			if(music.getSinger().equals(singer)) {
				findlist.add(music);
			}
			
		}
			return musiclist;			
		
	}
	public void delete(int i) {
		musiclist.remove(i);
			
	}
	public int deleteindex(String Singer) {	
		int i =0;
		for(Music music : musiclist) {
		if(music.getSinger().equals(Singer)) {
		return  i++;		}			
	}
		return -1;
	}
	public Music musicinfo(String singer) {
		for(Music music : musiclist) {
			if(music.getSinger().equals(singer)) {
				return music;
			}
			
		}
		return null;
	}
	public void updatemusic(int index, Music music) {
		musiclist.set(index, music);
	}
}
