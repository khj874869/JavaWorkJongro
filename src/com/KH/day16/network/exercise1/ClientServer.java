package com.KH.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null; 
		try {
			serverSocket = new ServerSocket(2322);
			Socket socket = serverSocket.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream();			
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 대기중");
			
			System.out.println("클라이언트 접속 완료");
			while(true) {
				byte [] bytes = new byte[1024];
				is.read(bytes);
				int BytesNo = is.read(bytes);
				//bytes에는 읽은 데이터, readByteNo은 읽은 객수
				//byte로 출력할 수 없어서 문자열로 만들어줌.
				String massage 
				= new String(bytes,0,BytesNo);
				System.out.printf("클라이언트(상대) : %s\n",massage);
				
				System.out.print("서버 메세지 출력:");
				massage = sc.nextLine();
				bytes = massage.getBytes();
				os.write(bytes);
				os.flush();
			
			}
			//읽을 때에는 read()메소드 사용
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
