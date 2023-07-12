package com.KH.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame {
	private	JLabel la = new JLabel();
	Container c = getContentPane();
	  public Exercise_ChangeBackground() {
		setTitle("Exercise_ChangeBackground");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout()); 
		c.addKeyListener(new MyKeyListener() );													//F1키를 입력받으면 배경 초록색
		c.add(la);									//%키를 입력 받으면 노락색
		setVisible(true);
		setSize(300,150);
		c.setFocusable(true);
		c.requestFocus();
	
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			if(e.getKeyChar() == '%') 
				c.setBackground(Color.YELLOW);
			
			else if(e.getKeyCode() == KeyEvent.VK_F5) 
				c.setBackground(Color.GREEN);							
			else {
				c.setBackground(Color.LIGHT_GRAY);
			}
			
		}
	}
	public static void main(String[] args) {
		new Exercise_ChangeBackground();
	}

}
