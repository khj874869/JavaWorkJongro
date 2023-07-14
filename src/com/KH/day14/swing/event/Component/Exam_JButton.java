package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Exam_JButton extends JFrame {
	
	public Exam_JButton() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		ImageIcon normalIcon = new ImageIcon("src/images/normalIcon.gif");
		ImageIcon press = new ImageIcon("src/images/Image20230713110356.gif");
		ImageIcon roll = new ImageIcon("src/images/Image20230713110404.gif");
		JButton btn = new JButton("Call",normalIcon);
		btn.setPressedIcon(press);
		btn.setRolloverIcon(roll);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		//버튼 안에 텍스트 및 이미지의 수평, 수직 위치 조정 메소드
//		btn.setHorizontalAlignment(SwingConstants.CENTER);
//		btn.setVerticalAlignment(SwingConstants.BOTTOM);
		c.add(btn);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JButton();
	}

}
