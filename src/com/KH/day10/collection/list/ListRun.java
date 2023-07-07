package com.KH.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.KH.day10.RList;
import com.KH.day10.collection.Student.Student;

public class ListRun {

	public static void main(String[] args) {
	List<Student> str = new ArrayList<Student>();
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());
	str.add(new Student());

	for(int i = 0; i<str.size();i++) {
		System.out.println(str.get(i).toString());
	}
	}
	public void List() {
		List<String> strList = new ArrayList<String>();
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		System.out.println(strList.get(0));
		for(int i =0 ; i<strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : "+strList.get(i));
		}		
		System.out.println("===================================");

		strList.add(2,"체리");
		for(int i =0 ; i<strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : "+strList.get(i));
		}
		System.out.println("===================================");

		strList.set(2,"파인애플");
		
		for(int i =0 ; i<strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : "+strList.get(i));
		}
		System.out.println("===================================");

		strList.remove(2);
		for(int i =0 ; i<strList.size(); i++) {
			System.out.println((i+1)+"번째 값 : "+strList.get(i));
		}
//		ArrayList<String> atList = new ArrayList<String>();

	}
	public void generic() {
		RList<Integer> list= new RList<Integer>();
		list.add(10);
		list.add(20);
		list.add(923);
		int num = list.get(0);
		System.out.println("num :" + num);
	}
	public void objectExample() {
		ObjectList objlist = new ObjectList();
		objlist.add(10);
		objlist.add('a');
		objlist.add('월');
		
		Object obj = objlist.get(0);
		int num = (int)obj;
		Object obj2 = objlist.get(1);
		String str = (String)obj2;
		char cOne = (char)objlist.get(2);
		//Type mismatch: cannot convert from Object to int
		System.out.println();
	}
	public  void intExample() {
		IntList nums = new IntList();
		nums.add(20);
		nums.add(21);
		nums.add(22);
		int result1 = nums.get(2);
		System.out.println("result1 : " + result1);
		int size = nums.size();
		System.out.println("Size : "+size);
		nums.clear();
	}

}
