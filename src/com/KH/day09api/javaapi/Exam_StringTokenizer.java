package com.KH.day09api.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name-kite&addr=seoul&ad=21";
//		String [] words = query.split("&");
		StringTokenizer st = new StringTokenizer(query,"&=");
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
		}
	}
}
