package com.KH.day11.IoStream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		
		Reader reader = null;//Cannot instantiate the type Reader
		
		try {	
			//요런 것들을 Checked Exeption 이라고 함
			//Unhandled exception type IOException 
			reader = new FileReader("src\\com\\KH\\day11\\IoStream\\reading.txt"); //FileReader cannot be resolved to a type Try catch 써야함.
			while(true) {	
					int readDate = reader.read();//Unhandled exception type IOException
					if(readDate == -1) break; 					
					System.out.print((char)readDate);
				
			}
				
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				}		
			}
		}
	}
