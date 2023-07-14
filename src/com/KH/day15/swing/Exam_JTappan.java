package com.KH.day15.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Exam_JTappan extends JFrame {

	public Exam_JTappan() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane= createTabbedPane() ;
		c.add(pane, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);

	}

	public JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("super-man", new JLabel(new ImageIcon("src/images/superman.jpg")));
		pane.addTab("wonder-woman", new JLabel(new ImageIcon("src/images/wonderwoman.jpg")));
		pane.addTab("spider-man", new JLabel(new ImageIcon("src/images/s.jpg")));
		return pane;
	}
	public static void main(String[] args) {
		new Exam_JTappan();
	}

}
