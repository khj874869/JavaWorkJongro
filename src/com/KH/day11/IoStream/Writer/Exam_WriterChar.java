package com.KH.day11.IoStream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterChar {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src\\\\\\\\com\\\\\\\\KH\\\\\\\\day11\\\\\\\\IoStream\\\\\\\\writing2.txt");
			char [] cbuf = "I.O Stream Good".toCharArray();
			writer.write(cbuf);
			writer.flush(); //버퍼 비우기 스트림에 있는 데이터 들을 비워낸다. close랑 둘 중 하나만 써도 동작한다.
			System.out.println("write(char[]) 동작 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close(); //버퍼를 비우지 않아도 스트림을 종료하기 때문에 버퍼가 비워진다.
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
