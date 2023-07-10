package com.KH.day11.IoStream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//writer 파일 생성함 
public class Exam_Writer {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			//Unhandled exception type IOException
			writer = new FileWriter("src\\\\com\\\\KH\\\\day11\\\\IoStream\\\\writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray(); //문자열 배열로 바꾸는 메소드 
			for (int i = 0; i < data.length ; i++) {
				writer.write(data[i]);
			}
			writer.flush(); // 버퍼를 모두 비워줌. 버퍼에 데이터가 남아 있으면 파일에 데이터가 떨어지지 않는다. 
			//파일 생성 불가능함
			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} //자원 해제 없이 하려면 writer.finish() 메소드를 사용하여 없애야 함.
//		}
 	
