package com.KH.day11.IoStream.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.xml.crypto.Data;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자 스트림 FileReader 와 FileWriter를 이용하여
		//c:\windows\system.ini를 c:Temp\system.txt 파일로 복사하는 프로그램을 작성하라.
		Reader reader = null;
		Writer writer = null;
		File src = new File("c:\\windows\\system.ini");//원본 파일 경로명
		File dest = new File("C:\\\\tools\\\\system.txt");//복사 파일 경로명 
		try {
			reader = new FileReader("c:\\windows\\system.ini");
			writer = new FileWriter("C:\\tools\\system.txt"); 
			//파일 입출력을 이용한 폴더 만들기
			File folderMake = new File("c:\\Temp");
			if(!folderMake.exists()) {
				folderMake.mkdir();
			}
			int readCharCount;
			while(true) {
				readCharCount=reader.read();
				if(readCharCount==-1) break;
				writer.write((char)readCharCount);
			};
			System.out.println("복사 완료!");
			writer.flush();
			reader.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	

}
