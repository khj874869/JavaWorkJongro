package com.KH.day11.IoStream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
		public static void main(String[] args) {
			//C드라이브에 있는 파일을 E드라이브로 복사함
			//입력 스트림
			InputStream is = null;
			OutputStream os = null;
			File src= new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			File dest = new File("c:\\Temp\\copyimg.jpg");
			int readbyte;
			byte [] readbytes = new byte[1024*10];  //배열을 이용하여 10KB씩 쓰려고 한다.

			try {
				File folder = new File ("c:\\Temp");
				if(!folder.exists()) {
					folder.mkdir();
				}
				is = new FileInputStream(src);
				os = new FileOutputStream(dest);
				int readByteCount;
				while(true){
//					readByteCount = is.read();
					readbyte = is.read(readbytes);
//					if(readByteCount ==-1) break; 
//					System.out.println("");
//					os.write((char)readByteCount);
					os.write(readbytes,0,readbyte); // 고속복사하는 코드 , 10kb씩 읽어 복사한다.
					if(readbyte<readbytes.length)break;//읽은 갯수가 현저히 적어지면 무한 반복 탈출
				}
				os.flush();
				is.close();
				os.close();
				System.out.printf("%s를 %s로 복사하였습니다." , src.getPath(),dest.getPath());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}		 
			  catch (IOException e) {
				e.printStackTrace();
			}
			}
}
