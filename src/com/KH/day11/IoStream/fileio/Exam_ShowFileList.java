package com.KH.day11.IoStream.fileio;

import java.io.File;

public class Exam_ShowFileList {

		public static void listDirectory(File dir) {
			System.out.println("-----" + dir.getPath() +
			"의 서브 리스트 입니다.-----");
			File[] subFiles = dir.listFiles();
			for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.printf("%-35s",f.getName());
			System.out.print("파일 크기: " + f.length() + "\t");
			//%tb : 현재의 날짜를 영문 약자(월) 형식으로 출력(한글은 숫자 + 월 출력)
			//%td : 현재 날짜는 01~31(일) 형식으로 출력
			//%ta : 현재의 날짜를 요일 영문 약자 형식으로 출력(한글 월/화/수/...출력)
			//%tT : 현재의 시간을 몇시 : 몇분 : 몇 초 형식으로 출력
					
			System.out.printf("\t수정한 시간: %tb %td %ta %tT \n",t,
			t, t, t);
			}
			}
			public static void main(String[] args) {
			File f1 = new File("c:\\windows");
			System.out.println(f1.getPath() + ", " + f1.getParent() + ", " +
			f1.getName());
			String res="";
			if(f1.isFile()) res = "파일";
			else if(f1.isDirectory()) res = "디렉토리";
			System.out.println(f1.getPath() + "은 " + res + "입니다.");
			File f2 = new File("c:\\Temp\\java_sample");
			if(!f2.exists()) {
			f2.mkdir(); 
			}
			listDirectory(new File("c:\\"));
			f2.renameTo(new File("c:\\"));
			listDirectory(new File("c:\\"));
			
		}
	}

			
