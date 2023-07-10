package com.KH.day11.IoStream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os  = null;
		
		try {
			os = new FileOutputStream("src\\\\com\\\\KH\\\\day11\\\\IoStream\\\\outputing.txt");
			byte [] data = "헬로우 입출력".getBytes();
			for(int i = 0 ; i <data.length ;i++) {	
				os.write(data[i]);
			}
			os.flush(); //buffer 비우기
			System.out.println("쓰기 완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
	}
}
