package com.KH.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_anonymousClassListener3 extends JFrame{
	public Exam_anonymousClassListener3() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("action")) {
					btn.setText("액션");
				}else {
					btn.setText("action");
				}
				setTitle(btn.getText() + "이벤트리스너 예제");
			}
		});		
		c.add(btn);		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_anonymousClassListener3();
	}
}