package com.KH.day17.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	
 public static void main(String[] args) {
	// 채팅서버를 구동 중입니다...
	// 채팅서버를 구동하였습니다..
	// 클라이언트의 접속을 기다리고 있습니다.
	// 클라이언트가 접속하였습니다.
	// 채팅이 시작되었습니다.
	// 서버(나) : 하이
	// 클라이언트(상대) : 네네
	 ServerSocket serversocket = null;
	 int port = 2345;
	InputStream is = null;
	OutputStream os = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	Scanner sc = new Scanner(System.in);
	 try {
		System.out.println("채팅서버 구동중");
		serversocket = new ServerSocket(port);
		System.out.println("채팅서버 구동함");
		System.out.println("클라 서버 접속 대기 중");
		Socket socket=serversocket.accept();
		System.out.println("클라 서버 접속 함.");
		is = socket.getInputStream();
		os = socket.getOutputStream();
		dis = new DataInputStream(is);
		dos = new DataOutputStream(os);
		System.out.println("채팅이 시작 되었습니다.");
		while(true) {
			System.out.print("서버(나) 메세지 입력 :");
			String SendMsg = sc.nextLine();
			dos.writeUTF(SendMsg); //보내기
			dos.flush();
			System.out.println("클라이언트 채팅을 시작합니다.");
			String recvMsg = dis.readUTF(); //받기
			System.out.printf("클라이언트(상대) : %s\n" ,recvMsg);			
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 System.out.println("채팅 서버를 구동 중 입니다.");
	 
 }
}
