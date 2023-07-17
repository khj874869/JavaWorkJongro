package com.KH.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam_ChattingServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(2222);
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 대기 중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			//1.데이터 받기
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message 
			= new String(bytes,0,readByteNo);
			System.out.printf("클라이언트(상대) : %s\n",message);
			
			//=======================받기 완료 =======================
			//보내기
			os = socket.getOutputStream();
			System.out.print("서버(나): 메세지");
			message = sc.nextLine();
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
