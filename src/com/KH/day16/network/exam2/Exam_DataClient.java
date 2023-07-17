package com.KH.day16.network.exam2;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_DataClient {

	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		String ipAddress = "127.0.0.1";
		int port = 4895;
		try {
			System.out.println("연결 요청");
			Socket socket = new Socket(ipAddress,port);
			System.out.println("연결 성공");
			os = socket.getOutputStream(); //소켓에 있는 스트림을 가져와서
			String message = "Hello Server!";
			//===============================================데이터 보내기=========================
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//보냈음
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			message = new String(bytes,0,readByteNo);
			System.out.printf("데이터 받기 성공 : %s",message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
