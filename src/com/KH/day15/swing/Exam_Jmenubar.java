package com.KH.day15.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_Jmenubar extends JFrame {
	public Exam_Jmenubar() {
		setTitle("메뉴 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
	
	}
	private void createMenu() {
		JMenuBar bar = new JMenuBar(); //메뉴바
		JMenu screenMenu = new JMenu("Screen"); //메뉴(Screen)
		
		screenMenu.add(new JMenuItem("Load"));//메뉴아이템
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.add(new JMenuItem("Exit"));
	
		bar.add(screenMenu);
		bar.add(new JMenu("Edit"));
		bar.add(new JMenu("Source"));
		bar.add(new JMenu("Project"));
		bar.add(new JMenu("Run"));
		setJMenuBar(bar);//Frame추가
		
		
	}
	public static void main(String[] args) {
		new Exam_Jmenubar();
	}

}
