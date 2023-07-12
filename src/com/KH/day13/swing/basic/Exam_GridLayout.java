package com.KH.day13.swing.basic;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_GridLayout extends JFrame {
	public Exam_GridLayout() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
//		c.setLayout(new GridLayout(4,2,0,5));		
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField("일용자"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("이용자"));
		c.add(new JLabel("학과"));
		c.add(new JTextField("samyongja"));
		c.add(new JLabel("과목"));
		c.add(new JTextField("서울중구종각"));
		c.add(new JButton("입력"));
		c.add(new JButton("출력"));
		
		setSize(300,200);
		setVisible(true);
		}
	public static void main(String[] args) {
		
		new Exam_GridLayout();
	}
}
