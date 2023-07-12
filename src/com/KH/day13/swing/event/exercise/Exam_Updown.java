package com.KH.day13.swing.event.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_Updown extends JFrame {
	public Exam_Updown() {
		setTitle("상하 좌우");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final int FLYING_UNIT =10;
		
		Container c = getContentPane();
		JLabel la = new JLabel("FU");
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		c.setLayout(null);
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				switch(keyCode) {
				case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-FLYING_UNIT);
				break;
				case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+FLYING_UNIT);break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+FLYING_UNIT,la.getY());
					break;
				}
			}
		});
	}
	public static void main(String[] args) {
		new Exam_Updown();
	}

}
