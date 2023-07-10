package com.KH.day11.IoStream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharacter {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src\\\\com\\\\KH\\\\day11\\\\IoStream\\\\reading.txt");
			int readercount;
			char [] cBuf = new char[3];
//			int i =0;
			String result = "";
			while( true) {
				readercount = reader.read(cBuf);
//				System.out.println(readercount);
				if(readercount ==-1) break;
				result += new String(cBuf,0,readercount);
//				for(char c : cBuf) {
//					System.out.print(c);					
//					}
////				System.out.println();
//				i++;
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
