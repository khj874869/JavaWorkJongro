package com.KH.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class BaseballServer {

	public static void main(String[] args) {
		int port = 2234;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ServerSocket serversocket =null;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int [] comarrs = new int[3];
		int count =0;
		int count1 = 0;
		try {
			LocalDate now = LocalDate.now();			
			System.out.println("클라이언트 대기");
			System.out.println(now);
			serversocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			Thread.sleep(1000);
			System.out.println("클라이언트 접속을 기다립니다.");
			Socket socket = serversocket.accept();
			System.out.println("클라이언트 접속");
			
			is= socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos  = new DataOutputStream(os);
			System.out.println("서버숫자 >>");
			
			for(int i =0 ; i<comarrs.length;i++) {				
				comarrs[i] =(int)(Math.random()*9+1);
				for(int j =0 ; j<i;j++) {
					if(comarrs[j] == comarrs[i]) {
						i--;
						break;
					}
					
				}
			}
			System.out.printf("%d %d %d\n",comarrs[0] ,comarrs[1] ,comarrs[2]);
			System.out.println();
			System.out.println("서버 준비 완료");
			while(true) {
				
			String msg = dis.readUTF();
			System.out.printf("받기 :%s",msg);
			String [] msgarrs = msg.split(" ");
			String result = " ";
			
			
			for(int i =0 ; i<msgarrs.length;i++) {
				Integer.parseInt(msgarrs[i]);					
			}
		for(int i =0;i<3;i++) {			
			for(int j =0; j<3;j++) {	
				if(comarrs[i] == Integer.parseInt(msgarrs[i])&&count<=3) {
					if(i==j) {
						count++;						
					}
				}
				else {
					count1++;
					
					break;
				}
			}
		}
			result = count + " 스트라이크 " + count1 + " 볼 ";
			dos.writeUTF(result);
			dos.flush();
			if(count == 3) {
				System.out.println("아웃! 게임종료");
				break;
			}
			
			}
		}
			
			catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
}

