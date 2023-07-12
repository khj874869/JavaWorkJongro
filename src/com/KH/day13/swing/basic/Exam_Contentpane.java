package com.KH.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_Contentpane extends JFrame {
	public Exam_Contentpane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //실제 종료 하도록 하게 하는 기능
														//그전엔 안보이게만 했음.
		Container contentpane = getContentPane();; 
		contentpane.setBackground(Color.red);
		contentpane.setLayout(new FlowLayout());
		contentpane.add(new JButton("okay"));
		contentpane.add(new JButton("cancle"));
		contentpane.add(new JButton("Ignore"));
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_Contentpane();
	}

}
