package com.KH.day13.swing.basic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_FlowLayout extends JFrame {

	public Exam_FlowLayout() {
		setTitle("FlowLayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//수평간격(hGap)이 30이고 수직간격(vGap)이 40 LEFT로 정렬배치
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("multi"));
		c.add(new JButton("div"));
		c.add(new JButton("Caculates"));
		
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Exam_FlowLayout();
	
	}

}
