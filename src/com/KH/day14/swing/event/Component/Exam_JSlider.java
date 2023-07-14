package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Exam_JSlider extends JFrame {

	public Exam_JSlider() {
		setTitle("JSlider 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		c.add(slider);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JSlider();
	}
}
