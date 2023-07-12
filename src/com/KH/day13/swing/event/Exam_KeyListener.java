package com.KH.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_KeyListener extends JFrame {
	
	public Exam_KeyListener() {
		
		setTitle("KeyListener Example"); //제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫을때 완전 닫기
		JLabel [] laArrs = new JLabel [3];
		laArrs [0] = new JLabel("getKeyChar()");
		laArrs [1] = new JLabel("getKeyCode()"); 
		laArrs [2] = new JLabel("getKeyText()");// 컴포넌트 label 초기값 설정
//		JLabel la = new JLabel("getKeyChar()");
//		JLabel la1 = new JLabel("getKeyCode()");
//		JLabel la2 = new JLabel("getKeyText()");
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		c.addKeyListener(new KeyAdapter() {
		public void KeyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();//유니코드키
			int keyCode = e.getKeyCode();//가상키
			laArrs [0].setText(Integer.toString(keyCode));
			laArrs [1].setText(Character.toString(keyChar)); //f5,f10등 매핑 안되있는 건 안나옴 
			laArrs [2].setText(e.getKeyText(keyCode));
		}
		});
		for(JLabel la : laArrs) {
			la.setOpaque(true);
			la.setBackground(Color.YELLOW);
			c.add(la);
//		}
//		la.setOpaque(true); //바탕색이 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la1.setOpaque(true); //바탕색이 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la2.setOpaque(true); //바탕색이 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la.setBackground(Color.yellow);
//		la1.setBackground(Color.yellow);
//		la2.setBackground(Color.yellow);
//		
//		c.add(la);
//		c.add(la1);
//		c.add(la2);
//		
		
		setSize(300,150);
		setVisible(true);
		//스윙 프레임이 만들어 질 포커스를 주고자 하는 경우 setVisible 이후에 
		//포커스를 주어야 함.
		c.setFocusable(true); //component가 포커스를 받을 수 있도록 설정
		c.requestFocus();} 	  // 입력 받은 값이 component에 포커스를 강제 지정하여 그 쪽으로 나오게 한다.
		
		
	}
	public static void main(String[] args) {
		new Exam_KeyListener();
	}

}
