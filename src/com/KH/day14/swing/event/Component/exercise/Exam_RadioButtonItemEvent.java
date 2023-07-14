package com.KH.day14.swing.event.Component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Exam_RadioButtonItemEvent extends JFrame {
	private JRadioButton [] fruits;	//라디오버튼 객체배열
	private String [] names = {"사과","배","체리"};//라디오버튼 이름 배열
	private ImageIcon [] images = { //이미지 라벨에 들어갈 이미지 아이콘 배열
			new ImageIcon("src/images/apple.jpg"),
			new ImageIcon("src/images/pear.jpg"),
			new ImageIcon("src/images/cherry.jpg")			
	};
	private JLabel imageLabel;
	public Exam_RadioButtonItemEvent() {
		setTitle("JRadioButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());//보더 레이아웃 설정
	
		fruits = new JRadioButton[3];	//라디오 버튼 객체 배열 생성함
		JPanel radioPanel = new JPanel();
		imageLabel = new JLabel(); //라벨 객체 생성함
		ButtonGroup btnG = new ButtonGroup();
		for(int i =0;i<fruits.length;i++) {
			fruits[i]= new JRadioButton(names[i]); //반복문으로 라디오버튼 객체 생성 후 배열에 넣는다
			btnG.add(fruits[i]);       	 	//라디오 버튼 중 1개만 선택되도록 버튼 그룹 설정해줌
			radioPanel.add(fruits[i]); //새로 만든 라디오 팬에 추가
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						return;
					}
					if(fruits[0].isSelected()) {
						imageLabel.setIcon(images[0]); //setIcon()메소드 처음봄, Label이미지를 set해주는 메소드

					}else if(fruits[1].isSelected()) {
							imageLabel.setIcon(images[1]);
					}
					else if(fruits[2].isSelected()) {
						imageLabel.setIcon(images[2]);

					}
				}
			});
		
		}
		radioPanel.add(fruits[0]);
		radioPanel.setBackground(Color.LIGHT_GRAY);
		c.add(radioPanel,BorderLayout.NORTH); //라디오팬을 컨텐트팬에 추가 탑으로 붙여 보인다.
		c.add(imageLabel, BorderLayout.CENTER); //이미지 라벨은 센터에 위치
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지 라벨 안에 이미지도 가운데 정렬한다.
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_RadioButtonItemEvent();
	}
}
