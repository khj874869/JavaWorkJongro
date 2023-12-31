package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame {
	public Exam_JRadioButton() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("src/images/cherry.jpg");
		ImageIcon selectedcherry = new ImageIcon("src/images/selectcherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과",true);
		JRadioButton  pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherry);
		
		//라디오 버튼은 1가지만 선택되도록 해주는 버튼 그룹,
		//input태그의 name을 맞춰주는 것과 똑같음
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}
}
