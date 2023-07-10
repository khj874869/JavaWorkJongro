package com.KH.day11.IoStream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_writeByte {
	public static void main(String[] args) {
		OutputStream os  = null;
		try {
			
			os = new FileOutputStream("src\\\\\\\\com\\\\\\\\KH\\\\\\\\day11\\\\\\\\IoStream\\\\\\\\outputingException.txt");
			byte[] byteos = "리얼 입출력".getBytes();
			os.write(byteos,0,4);
			os.flush();
			System.out.println("쓰기 완료");		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
