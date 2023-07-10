package com.KH.day11.IoStream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {
	public static void main(String[] args) {
		//Exam_FileCopy 파일을 읽어 콘솔에 출력해보세요.
		Reader reader = null;
		try {
			reader = new FileReader("src//com//KH//day11//IoStream//exercise//Exam_FileCopy.java");
			while(true) {	
				int readDate = reader.read();
				if(readDate == -1) break; 					
				System.out.print((char)readDate);	
		}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
/* InputStream i s = null;
 * try{
 * is =  new FileInputStream("주소")
 * bye [] readBytes = new Byte[1024]
 * int readByteCount;
 * String reuslt = "";
 * while ((readByteCount = is.read(ReadBytes)) != -1)}
 * result += new String(readBytes,0,readByteCount
 * InputStream으로 하는 코드*/
