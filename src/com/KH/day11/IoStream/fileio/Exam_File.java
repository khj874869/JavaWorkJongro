package com.KH.day11.IoStream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		
		File file = new File("D:\\\\딱따구리\\\\healing.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.printf("파일 이름은 : %s \n 파일 경로 : %s \n 부모 폴더 : %s \n",fileName
				,path
				,parent);
		System.out.printf("파일이 존재하는가? : %b\n 파일이 맞는가? : %b\n 폴더가 맞는가? : %b\n"
				,file.exists()
				,file.isFile()
				,file.isDirectory());
	}
	public void folderMake() {
		File folderMake = new File("D:\\\\\\\\딱따구리\\\\\\\\healing.jpg");
		folderMake.mkdir(); //mkdirs() 메소드는 폴더를 만드는 메소드인데 계층형 폴더를
		//한번에 만들어주는 메소드임.
		System.out.println("폴더가 만들어 졌습니다!");
	}
	public void fileMake() {
		
		try {
			File fileMake = new File("D:\\\\\\\\딱따구리\\\\\\\\healing.jpg");
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
