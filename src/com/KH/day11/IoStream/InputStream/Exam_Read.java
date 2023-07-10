package com.KH.day11.IoStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream inputstream = null;
		try {
			inputstream = new FileInputStream("src\\\\\\\\\\\\\\\\com\\\\\\\\\\\\\\\\KH\\\\\\\\\\\\\\\\day11\\\\\\\\\\\\\\\\IoStream\\\\\\\\\\\\\\\\writing2.txt");
			int readByte;
//			while(true) {				
//				readByte = inputstream.read();
//				System.out.print((char)readByte);
//				if(readByte == -1) break;
//			}
			do {
				readByte = inputstream.read();			
				System.out.print((char)readByte); //위에 코드를 줄임
			}
			while(readByte != -1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
