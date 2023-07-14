package com.KH.day13.swing.StudentModel;

import java.util.ArrayList;
import java.util.List;


import com.KH.day13.swing.Student.Student;
import com.KH.day13.swing.Studentview.view;

public class Student_modeling {
	List<Student> student;
	public Student_modeling() {
		student = new ArrayList<Student>();
	}
	public static void main(String[] args) {
		view vw = new view();
		int val = vw.printInfo();
		switch(val) {
		case 1 :  int v =vw.injection()
		
				; break;
		case 2 : ; break;
		case 3 : ; break;
		case 4 : ; break;
		
		}
	}
}
