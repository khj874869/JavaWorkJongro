package com.KH.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener2 extends JFrame{
	public Exam_IndepClassListener2() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_IndepClassListener2();
	}
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("action")) {
				btn.setText("액션");
			}else {
				btn.setText("action");
			}
			Exam_IndepClassListener2.this.setTitle(btn.getText() + "이벤트 리스너 예제");
		}		
	}
}