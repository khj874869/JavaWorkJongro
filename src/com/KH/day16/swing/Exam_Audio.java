package com.KH.day16.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_Audio extends JFrame{
	JLabel jl;
	String [] names = {"play","stop","play again"};
	private Clip clip;
	public Exam_Audio() {
		jl = new JLabel();
		setTitle("Exam_Audio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());

		for(int i = 0 ; i<names.length;i++) {
			JButton btn = new JButton(names[i]); 
			btn.addActionListener(new MyActionListener());
			
			c.add(btn);
		}
		
		setVisible(true);
		setSize(300,200);
		loadAudio("src/images/애국가1절.wav");
	}
	private class MyActionListener implements ActionListener { //내부 클래스 방식
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "play" : 
				clip.start();
				break;
			case " stop" : 
				clip.stop();
				break;
			case "play again" :
				clip.setFramePosition(0);
				clip.start();
				break;
			}
		}
		
	}
	private void loadAudio(String audioPath) {
		try {
			//클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip() ;//비어 있는 오디오 클립//checkedException
			File audioFile = new File(audioPath);
			AudioInputStream audiostream
			= AudioSystem.getAudioInputStream(audioFile);
			clip.open(audiostream);
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
		new Exam_Audio();
	}

}
