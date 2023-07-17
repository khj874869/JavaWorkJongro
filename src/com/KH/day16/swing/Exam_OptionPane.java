package com.KH.day16.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{

	public Exam_OptionPane() {
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton());
		c.add(new Mypane());
		
		
		setSize(500,200);
		setVisible(true);
	
	}
	private class Mypane extends Panel{
		private JButton inputBtn;
		private JButton confirmBtn;
		private JButton msgBtn;
		private JTextField tf;
		
		public Mypane() {
			setBackground(Color.LIGHT_GRAY);
			inputBtn = new JButton("Input Name");
			confirmBtn = new JButton("Confirm");
			msgBtn = new JButton("Message");
			tf = new JTextField(10);
			inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = 
					JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name != null) {
						tf.setText(name);//텍스트 필드에 출력하도록 하는 것임
					}
					int choice=
							JOptionPane.showConfirmDialog(null,"계속 할 것입니까?", "확인", JOptionPane.YES_NO_OPTION);
//					if(choice == JOptionPane.CLOSED_OPTION) // X표시 누르면
					if(choice == JOptionPane.YES_OPTION) {
						tf.setText("Yes");
					}
					else if(choice == JOptionPane.NO_OPTION) {
						tf.setText("No");
						
					}
				}
			}); // inputbutton 눌리면 동작하게 함
			msgBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"조심하세요","message",JOptionPane.ERROR_MESSAGE);
				}
			});
			
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(tf);
		}
		
	}
	public static void main(String[] args) {
		new Exam_OptionPane();
	}

}
