package com.KH.day15.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class Exam_JToolbar extends JFrame {
	private Container contentPane;
	
	public Exam_JToolbar() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolbar();
		setSize(400,200);
		setVisible(true);
	
	}
	private void createToolbar() {
		
		JToolBar toolbar = new JToolBar();
		toolbar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일 생성합니다.");
		toolbar.add(newBtn);
		JButton openBtn = new JButton(new ImageIcon("src/images/새창.jpg"));
		openBtn.setText("파일을 엽니다.");
		toolbar.add(openBtn);
		toolbar.addSeparator();
		JButton saveBtn = new JButton(new ImageIcon("src/images/세이브.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		toolbar.add(saveBtn);
		contentPane.add(toolbar,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new Exam_JToolbar();
	}

}
