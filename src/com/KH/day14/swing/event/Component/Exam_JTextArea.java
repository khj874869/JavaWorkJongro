package com.KH.day14.swing.event.Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam_JTextArea extends JFrame {
	private JLabel textlabel;
	private JTextField fieldarea;
	private JTextArea jtextarea;
	private JScrollPane scrollpane;
	public Exam_JTextArea() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		textlabel =new JLabel("입력 후 <Enter>키를 입력하세요.");
		jtextarea = new JTextArea(7,20);
		fieldarea = new JTextField(20);
		scrollpane = new JScrollPane(jtextarea);//텍스트 영역 객체 전달하면서
												//스크롤땐 객체 생성
		c.add(textlabel);
		c.add(fieldarea);
		c.add(scrollpane);						//콘텐트팬에 스크롤팬 추가
		fieldarea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				jtextarea.append(jt.getText() + "\n");
				jt.setText("");
			}
		});
			
		setSize(300,300);
		setVisible(true);
		};
	
	
	public static void main(String[] args) {
		new Exam_JTextArea();
	}
}
