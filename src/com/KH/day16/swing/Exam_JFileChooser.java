package com.KH.day16.swing;

import java.awt.Container;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_JFileChooser extends JFrame{
	private JLabel ImgLabel;
		public Exam_JFileChooser() {
			ImgLabel = new JLabel();
			setTitle("메뉴와 파일 Chooser 사용 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.add(ImgLabel); //이미지를 표시하는 JLabel 추가
			createMenu();
			setSize(350,200);
			setVisible(true);
		
		}
	private void createMenu()  {
		JMenuBar bar = new JMenuBar(); // 메뉴바
		JMenu menu = new JMenu("File"); // 메뉴(Screen)
		//File
		// > Open
		JMenuItem Item = new JMenuItem("Open");
		Item.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
					int chosen = 
					chooser.showOpenDialog(null); //파일 선택창을 띄움
					//FileChooser 동작시 비 정상적인 선택
					if(chosen != JFileChooser.APPROVE_OPTION) {
						// 메세지 출력, 파일 선택 안했는데요?
						JOptionPane.showMessageDialog(null,"파일을 선택하지 않았습니다.",
								"경고", JOptionPane.WARNING_MESSAGE);
						return;//밑에 있는 코드로 넘어가지 않도록 해준다. 밑에 있는
						//코드를 실행할 시에 이미지를 선택하지 않아서 NullPointException 오류가 발생한다.
						//이 오류를 발생 시키지 않고 종료하게 해준다. 왜냐하면 리턴이라서 다시 되돌리기 때문이다.
					}
					String filePath= chooser.getSelectedFile().getPath();
					ImgLabel.setIcon(new ImageIcon(filePath)); //jLabel에 Image 표시하기
				}
			});
			menu.add(Item);
			bar.add(menu);
			setJMenuBar(bar);// Frame추가
		}

	
		
		
	public static void main(String[] args) {
		new Exam_JFileChooser();
	}
}
