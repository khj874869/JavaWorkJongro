package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Exam_JList extends JFrame {
	private String [] fruits = {"apple","banana","kiwi","mango","pear","peach"
			,"berry","strawberry","blackberry"};
	private ImageIcon [] images = {
			new ImageIcon("src/iamges/angle"),
			new ImageIcon("src/iamges/house"),
			new ImageIcon("src/iamges/key"),
			new ImageIcon("src/iamges/wifi")
			
	};
	private JScrollPane jscrollpane = new JScrollPane();
	public Exam_JList() {
		setTitle("리스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		JList<ImageIcon> imgList = new JList<ImageIcon>();
		imgList.setListData(images);
		c.add(imgList);
		JList<String> scrollList = new JList<String>(fruits);
		jscrollpane = new JScrollPane(scrollList);
//		jscrollpane.add(strList);
		c.add(jscrollpane);
//		c.add(new JScrollpane(scrollList));
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JList();
	}
}
