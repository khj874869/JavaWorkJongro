package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exam_copy extends JFrame {
	public Exam_copy() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("src/images/cherry.jpg");
		ImageIcon selectedcherry = new ImageIcon("src/images/selectcherry.jpg");
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox peal = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherry);
		
		c.add(apple);
		c.add(peal);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_copy();
	}
}
