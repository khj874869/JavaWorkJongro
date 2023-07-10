package com.KH.day11.IoStream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		//C드라이브에 있는 파일을 E드라이브로 복사함
		//입력 스트림
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Users\\user1\\Desktop\\bibivikFront-master"
					+ "\\bibivikFront-master\\CSS_Layout_exercise\\resources\\images\\healing.jpg");
			os = new FileOutputStream("D:\\딱따구리\\healing.jpg");
			int readByteCount;
			byte [] readbytes = new byte[1024];
			while((readByteCount = is.read(readbytes)) !=-1){
//				System.out.println("");
				os.write(readbytes,0,readByteCount);
				os.flush();
				
			}
			System.out.println("복사 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//출력 스트림 
		  catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}}
