package com.KH.day17.network.socket.Calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class serverCaculator {

	public static void main(String[] args) {
		//서버 구동중입니다.
		//클라이언트의 연결을 기다리고 있습니다.
		//클라이언트와 연결되었습니다.
		//클라이언트가 종료하였습니다.
		int port = 1234;
		ServerSocket serversocket =null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		Scanner sc= new Scanner(System.in);
		try {
//			System.out.println(" . ");
//			Thread.sleep(1000);
//			System.out.println(" .");
//			Thread.sleep(1000);
//			System.out.println(" .");
//			Thread.sleep(1000);
			System.out.println("서버 구동중 입니다.");
			for(int i= 1 ;i <=50 ;i++) {
				int progress = i;
				Thread.sleep(10);
				System.out.print("=");
			}
			serversocket = new ServerSocket(port);
			System.out.println("클라이언트 대기 중 입니다.");
			Socket socket =serversocket.accept();
			System.out.println("클라이언트 접속 확인.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				String msg = dis.readUTF();
				if(msg.equalsIgnoreCase("EXIT")) {
					System.out.println("클라이언트 종료");
					break;
				} 
				
				System.out.printf("클라이언트의 메세지 : %s\n",msg);
				//24 + 42  => 띄어쓰기 기준으로 문자열 배열을 만든다.  
				// 24 / + / 42
				String msgArrs[] =msg.split(" "); 
				if(msgArrs.length != 3) {
					String sendMsg =
							"end";
							dos.writeUTF(sendMsg);
							continue;
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = " ";
				String operator = msgArrs[1];
				switch (operator) {
				case "+" : result =String.valueOf(num1 + num2) ; break; //다른 방법 String.valueOf를 쓰거나 마지막에 +""를 추가해 문자열로 변환하면 writeUTF로 보낼 수 있음
				case "-" : result = String.valueOf(num1 - num2);break;
				case "*" : result =String.valueOf( num1 * num2 );break;
				case "%" : result =String.valueOf( num1 % num2 );break; 
				case "/" : result =String.valueOf(num1 / num2 );break;
				}
				dos.writeUTF(result);
				dos.flush();
			
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
