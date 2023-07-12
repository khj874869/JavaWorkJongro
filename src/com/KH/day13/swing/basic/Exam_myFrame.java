package com.KH.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_myFrame extends JFrame {
	public Exam_myFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
//		Exam_myFrame exFrame = new Exam_myFrame();
		new Exam_myFrame();
	}
}
