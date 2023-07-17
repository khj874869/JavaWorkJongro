package com.KH.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_DataServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;

		try {
			serverSocket = new ServerSocket(4895);
			System.out.println("소켓 생성 완료");
			System.out.println("클라이언트 연결 기다림");
			Socket socket =
			serverSocket.accept();
			System.out.println("연결 수락됨!");
			//==============================================데이터 받기==========================
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message = new String(bytes,0,readByteNo);
			System.out.printf("데이터 받기 성공 : %s" ,message);
			//콘솔창에 출력 
			//===============================데이터 보내기 ================
			
			os = socket.getOutputStream();
			message = "Hello Client";
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
