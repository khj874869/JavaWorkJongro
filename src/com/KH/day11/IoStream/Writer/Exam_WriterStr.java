package com.KH.day11.IoStream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterStr {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src\\\\\\\\com\\\\\\\\KH\\\\\\\\day11\\\\\\\\IoStream\\\\\\\\writing3.txt");
			char [] cbf = "일용자/이용자/삼용자".toCharArray();
			writer.write(cbf);
			writer.flush();
			System.out.println("동작");

		} catch (IOException e) {
		
				e.printStackTrace();
			}try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
