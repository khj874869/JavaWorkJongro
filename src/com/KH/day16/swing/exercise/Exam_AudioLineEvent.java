package com.KH.day16.swing.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_AudioLineEvent extends JFrame{
	private JLabel jl;
	private Clip clip;
	public Exam_AudioLineEvent() {
		jl = new JLabel("애국가 1절");
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		c.setBackground(Color.yellow);
		c.add(jl);
		setVisible(true);
		setSize(300,150);
		loadAudio("src/images/애국가1절.wav");
	}
	
	private void loadAudio(String audioPath) {
		try {
			//클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip() ;//비어 있는 오디오 클립//checkedException
			File audioFile = new File(audioPath);
			AudioInputStream audiostream
			= AudioSystem.getAudioInputStream(audioFile);//오디오 스트림 생성
			clip.open(audiostream);	//오디오 스트림을 이용한 오디오 클립
			clip.addLineListener(new LineListener() {
				
				@Override
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP) { //노래가 멈추면 
						getContentPane().setBackground(Color.ORANGE);
						jl.setText("연주 끝");
					}
					try {
						audiostream.close();  //스트림 닫기 자원 해제
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}); //노래가 끝나면 
			clip.start(); //프로그램 시작 하자 마자 노래를 시작하게 함
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			
		}
	}

	public static void main(String[] args) {
		new Exam_AudioLineEvent();
	}

}
