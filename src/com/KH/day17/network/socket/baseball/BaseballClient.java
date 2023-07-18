package com.KH.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 2234;
		InputStream is =null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket  = new Socket(address,port);
			System.out.println("서버 접속 완료");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				System.out.println("게임이 시작되었습니다.");
				System.out.print("띄어쓰기를 이용해 숫자를 입력해주세요.");
				System.out.print("-->");
				String msg = sc.nextLine();
				dos.writeUTF(msg);
				dos.flush();
				
				String msgw = dis.readUTF();
				System.out.printf(msgw);
				System.out.println();
				if(msgw.startsWith("3")) {
					System.out.print(	"3 스트라이크!! 축하합니다. ");
					break;
				}
				
			
				
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
