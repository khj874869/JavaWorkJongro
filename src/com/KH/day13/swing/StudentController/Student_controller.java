package com.KH.day13.swing.StudentController;

import java.util.ArrayList;
import java.util.List;

import com.KH.day13.swing.Student.Student;

public class Student_controller {
	List<Student> st ;
	public Student_controller() {
	st	= new ArrayList<Student>();
	}
	
	public void add(Student student) {
		st.add(student);
	}
}
