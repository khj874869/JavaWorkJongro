package com.KH.day10.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.KH.day10.collection.Student.Student;

public class Exam_Mapcollection {
	public static void main(String[] args) {
	Map<String,Student> stdmap = new HashMap<String,Student>();
	stdmap.put("one",new Student("타이타닉",44,66));
	stdmap.put("two",new Student("비낙호",55,77));
	System.out.println("첫번 째 학생 : " + stdmap.get("one"));
	System.out.println("두번 째 학생 : " + stdmap.get("two"));
	
	}
	public void mapExample2() {
		Map <String,Object> objmap = new HashMap<String,Object>();//Obj에는 여러 형이 들어갈 수 있음
		objmap.put("name","핫팩");
		objmap.put("price",1500);
		objmap.put("isGood",true);
		System.out.println("상품 이름은 " + objmap.get("name"));
		System.out.println("상품 가격은 " + objmap.get("price"));
		String result = (boolean)objmap.get("isGood") ? "추천" : "비추천";
		System.out.println("추천 여부는 : " + result);
	}
	public void mapExample() {
		Map<String , String>map = new HashMap<String,String>();
		map.put("02","서울");
		map.put("031","경기");
		map.put("061","전라도");
		map.put("053","대구");
		System.out.println("저장 된 데이터의 수 : " + map.size());
		System.out.println("02를 누르면 서울이 나옵니다. :" + map.get("02"));
		System.out.println("031를 누르면 경기가 나옵니다. :" + map.get("031"));
		System.out.println("061를 누르면 전라도가 나옵니다. :" +map.get("061"));
		System.out.println("053를 누르면 대구가 나옵니다. :"+map.get("053"));

		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력:");
		String regionCode =sc.next();
		System.out.println("입력하신 지역번호에 대한 지역은 :" + map.get(regionCode) );
		
		
	}
}
