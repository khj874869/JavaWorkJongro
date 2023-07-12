package com.KH.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseAdapter extends JFrame{
	public Exam_MouseAdapter() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel la = new JLabel("Hello world");
		la.setSize(50,20);
		la.setLocation(30,30);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		//추상 클래스는 이렇게 사용 되기도 한다.
		//인터페이스로 구현하면 모든 추상 메소를 오버라이딩 해야 하지만
		//추상 클래스로 만들면 원하는 추상 메소드만 오버라이딩 하면 된다.
		//추상 클래스는 추상 메소드 말고 다른 메소드를 가질 수 있기 때문이다.
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
		});
		setVisible(true);
		setSize(250,250);
	}
	public static void main(String[] args) {
		new Exam_MouseAdapter();
	}
}
