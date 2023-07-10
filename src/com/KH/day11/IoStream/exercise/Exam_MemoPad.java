package com.KH.day11.IoStream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 :");
		String context = sc.next();
		//경롷 입력 및 파일명으로 파일 생성
		Writer  writer = null;
		System.out.print("종료는 EXIT 입력 :");
		try {
			writer = new FileWriter("src//com//KH//day11//IoStream/" +context );
			//무한 반복 exit입력 시 빠져나오는 코드 
			for(int i =1;;i++ ){
				System.out.print(i + " : "  );
				String context1 = sc.nextLine();
				writer.write(context1+"\n");
				if(context1.equals("EXIT")) break;
				
			}
			writer.flush();
			System.out.println("파일 저장 완료 확인해보세요.");
			}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
	

