package com.KH.day14.swing.event.Component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_JComboActionEvent extends JFrame {
	private String [] fruits = {"apple","banana","kiwi","mango"};
	private ImageIcon [] images = {
			new ImageIcon("src/images/apple.jpg"),
			new ImageIcon("src/images/바나나.jpg"),
			new ImageIcon("src/images/키위.jpg"),
			new ImageIcon("src/image/망고.jpg")
			
	};
	private JLabel imgLabel;
	private JComboBox<String> jcombo;
	
	public Exam_JComboActionEvent() {
		setTitle("JCombobox 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		imgLabel = new JLabel(images[0]);
		jcombo = new JComboBox<String> (fruits);
		c.add(jcombo);
		c.add(imgLabel);
		jcombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 JComboBox<String>str
				 =(JComboBox<String>)e.getSource();	//e.getSource()는 이벤트가 발생할 콤포넌트를 가져옴(this와 비슷함)
				 int index = str.getSelectedIndex(); //선택된 이미지의 인덱스를 구해오는 메소드인데 DOM에도 있음
				 imgLabel.setIcon(images[index]);
			}
		});
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JComboActionEvent();
	}
}
