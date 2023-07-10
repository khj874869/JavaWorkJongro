package com.KH.day11.IoStream.bufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//성능 향상을 위한 보조 스트림, BufferedStream
public class Exam_BufferedStream {
	public static void main(String[] args) {
		//버퍼 크기를 5로 하고 표준 출력 스트림(System.out ) 과 연결한
		//버퍼 출력 스트림을 생성하라
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		Scanner sc = new Scanner(System.in);
		FileReader fir = null;
		//System.out.println("전달값");
		
		try {
			fir = new FileReader("src//com//KH//day11//IoStream//exercise//Exam_FileCopy.java" ) ;
			int readCharCount; 
			while((readCharCount = fir.read()) !=-1) {
			bout.write(readCharCount);
			}
			
			bout.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
