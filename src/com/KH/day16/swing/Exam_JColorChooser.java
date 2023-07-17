package com.KH.day16.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	private JLabel label;

public Exam_JColorChooser() {
	label = new JLabel("hello");
	setTitle("JColorChoose 에제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setFont(new Font("Ravie",Font.ITALIC,30));
	c.add(label,BorderLayout.CENTER);
	createMenu();
	setSize(250,200);
	setVisible(true);

}		

	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Text");	//Text
		JMenuItem item= new JMenuItem("color"); // ㄴColor
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color color = 	//선택된 색깔은 Color type으로 리턴됨
				JColorChooser.showDialog(null,"ColorPicker", Color.YELLOW);
				if(color != null) {
					label.setForeground(color);// 선택한 색으로 글씨색 설정
				}
			}
		});
		
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
	}

	public static void main(String[] args) {
		new Exam_JColorChooser();
}
}