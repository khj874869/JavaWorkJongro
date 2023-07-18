package com.KH.day17.network.socket.Calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clientCaculator {

	public static void main(String[] args) {
		//서버와 연결되었습니다.
		//계산식(빈칸으로 띄어 입력, 예 24+ 42) >> 23
		//잘못 입력하셨습니다. 형식에 맞게 입력해주세요.
		//계산식(빈칸으로 띄어 입력, 예 24+ 42 >> 24+ 42
		//계산결과 :66
		//exit
		String address = "127.0.0.1";
		int port = 1234;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println();
			Socket socket = new Socket(address,port);
			System.out.println("서버와 연결되었습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true)
			{
				System.out.println("계산식(빈칸으로 띄어 입력, 예 24 + 42) >>");
				System.out.print("클라이언트(나) 메세지 보내기:");
				String msg =sc.nextLine();
				dos.writeUTF(msg);
				if(msg.equalsIgnoreCase("EXIT")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();
				String msgw = dis.readUTF();
				if(msgw.equalsIgnoreCase("end")) {
					System.out.println(	"잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				System.out.printf("서버의 메세지 : %s\n", msgw);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
