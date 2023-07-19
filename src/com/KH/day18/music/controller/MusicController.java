package com.KH.day18.music.controller;

import java.util.List;

import com.KH.day18.music.model.dao.MusicDAO;
import com.KH.day18.music.model.vo.Music;

public class MusicController {
	private MusicDAO md ;
	
	public MusicController() {
	md = new MusicDAO();
	}
	public void addMusic(Music music) {
		md.Musicadd(music);
	}
	public List<Music> allMusicInfo() {
		List<Music> mList = md.musicinfo();
		return mList;
	}
	
	public List<Music> allsingerInfo(String singer){
		List<Music> singerList = md.singerinfo(singer);
		return singerList;
	}
	public int findindexInfo(String singer) {
	int index =	md.deleteindex(singer);
		return index;
	}
	public Music musicBysinger(String singer) {
		Music music  = md.musicinfo(singer);
		return music;
	}
	public void deleteMusic(int index) {
		md.delete(index);
	}
	public void modifyMusic(int index, Music music) {
		md.updatemusic(index,music);
	}

	
}
