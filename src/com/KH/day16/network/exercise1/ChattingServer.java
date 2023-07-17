package com.KH.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		String Address= "127.0.0.1";
		int Port = 2322;
		OutputStream os = null;
		InputStream is= null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청 중");
			
			//설정된 IP,Port에 연결 요청함
			Socket socket = new Socket(Address,Port);
			//연결 된 후에는 소켓 객체 생성
			System.out.println("연결 성공");
			//1.데이터 보내기
			//프로그램 기준 나가니까 OutputStream
			os = socket.getOutputStream();
			is = socket.getInputStream();
			while(true) {				
				System.out.print("클라이언트의 메세지 :");
				String message = sc.nextLine();
				byte [] bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				System.out.println("전송 성공");
				//보내기 완료
				//4.데이터받기
				//프로그램 기준 들어오니까 InputStream
				bytes = new byte[1024];
				int byteno = is.read(bytes);
				message = new String(bytes,0,byteno);
				System.out.printf("서버의 메세지 %s\n",message);
				//받기 완료 
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
