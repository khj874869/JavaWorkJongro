package com.KH.day15.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	private JButton btn;
	public MyDialog() {}
	public MyDialog(JFrame frame,String Title) {
		super(frame, Title);
		setLayout(new FlowLayout()); //레이아웃 설정
		add(new JTextField(10));	//텍스트 필드 추가
//		add(new JButton("OK"));		//텍스트 필드 옆 버튼 추가
	//다이얼로그 크기 세팅 
		btn=new JButton("OK");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		add(btn);
		setSize(200,100);
	}
}


public class Exam_JDialog extends JFrame {
	private MyDialog dialog;
	public Exam_JDialog() {
//		setTitle("메뉴 만들기 예제");
		super("메뉴 만들기 예제"); //setTitle 대신 super를 써도 된다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기
		JButton btn = new JButton("Show Dialog");	//버튼 생성
		dialog = new MyDialog(this,"Test Dialog");//다이얼로그 생성
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		Container c = getContentPane();
		c.add(btn);								//콘탠트팬에 버튼 추가하기
		
		setSize(250,200);
		setVisible(true);
	
	}
	private void createDialog() {
		
		
		
	}
	public static void main(String[] args) {
		new Exam_JDialog();
	}

}
