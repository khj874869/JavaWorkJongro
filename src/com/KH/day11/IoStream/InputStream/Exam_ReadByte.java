package com.KH.day11.IoStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src\\\\com\\\\KH\\\\day11\\\\IoStream\\\\reading.txt");
			int readByte;
			byte[] readBytes = new byte[3];
			String result ="";
			while((readByte = is.read(readBytes)) !=-1) {
//				readByte= is.read(readBytes);
//				if(readByte == -1 ) break;
				result += new String(readBytes,0,readByte);
				}
			System.out.println(result);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

