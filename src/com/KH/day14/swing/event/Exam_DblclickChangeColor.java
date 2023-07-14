package com.KH.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;

public class Exam_DblclickChangeColor extends JFrame {
	Container c = getContentPane();

	public Exam_DblclickChangeColor() {
		setTitle("DblClickChange");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel la = new JLabel("ㅇㅇ");
		Container c = getContentPane();
	
//		c.setBackground(Color.BLACK);
		c.addMouseListener(new MyMouseListener());
		c.add(la);
		setSize(300,200);
		setVisible(true);
		
	
	}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if(e.getClickCount() ==2) {
				int red =(int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(red,green,blue));
				
				super.mouseClicked(e);
			}
				
		}
	}
	public static void main(String[] args) {
		new Exam_DblclickChangeColor();
	}

}
