package com.KH.day15.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JmenuActionEvent extends JFrame {
	private JLabel imgLabel;
	public Exam_JmenuActionEvent() {
		setTitle("메뉴 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container  c = getContentPane(); //컨텐트 팬 
		imgLabel = new JLabel();		//이미지 들어갈 라벨
		c.setLayout(new BorderLayout());	//보더 레이아웃을 사용하겠다. TOP,LEFT,RIGHT,CENTER로 이루어져 있는 레이아웃이다.
		c.add(imgLabel,BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);

	}

	private void createMenu() {
		JMenuBar bar = new JMenuBar(); // 메뉴바
		JMenu screenMenu = new JMenu("Screen"); // 메뉴(Screen)
		String[] itemTitle = { "Load", "Hide", "ReShow", "Exit" }; //메뉴 아이템 
		for (int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);//아이템 배열에 넣기
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();//해당 클릭시 변경되게 함else if 보다 빠른 switch case
					switch (cmd) {//switch를 이용하여 분기마다 다른 효과를 줌
					case "Load":   
						imgLabel.setIcon(new ImageIcon("src/images/튤립.jpg")); //이미지 로딩시 리턴
						;
						break;
					case "Hide":
//						imgLabel.setIcon(null);
						imgLabel.setVisible(false);
						;
						break;
					case "ReShow":
						imgLabel.setVisible(true);
						;
						break;
					case "Exit":
						System.exit(0);
						;
						break;

					}
//				if(cmd.equals("Load")) {
//					setTitle(cmd);
//					//이미지를 로드하면 됨
//					
//				}else if(cmd.equals("Hide")) {
//					//숨기기
//				}else if(cmd.equals("Reshow")){
//					//다시 보여주기
//				}else if(cmd.equals("Exit")) {
//					//나가기
//				}
				}
			});
			screenMenu.add(menuItem);
		}
//		screenMenu.add(new JMenuItem("Load"));//메뉴아이템
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.add(new JMenuItem("Exit"));
		bar.add(screenMenu);
		setJMenuBar(bar);

		bar.add(screenMenu);
		bar.add(new JMenu("Edit"));
		bar.add(new JMenu("Source"));
		bar.add(new JMenu("Project"));
		bar.add(new JMenu("Run"));
		setJMenuBar(bar);// Frame추가

	}

	public static void main(String[] args) {
		new Exam_JmenuActionEvent();
	}

}
