package com.KH.day05.oop;
//static 에는 고유 할당된 공간이 있어서 프로그래머가 사용하는 heap 영역과 더불어 stack영역 
//그리고 static이라는 어디서나 바로 사용 가능한 메모리 공간에 정적 변수로 할당이 된다
class StaticSample { 
	public int num ; 
	public static int input;
	public void sampleMethod() {
		
	}
	public void goodMethod() {
		
	}
	public static void originMethod() {
		input = 1226;
	}
}


public class Exam_static {

	public static void main(String[] args) 
	{
		StaticSample sample = new StaticSample();
		StaticSample.originMethod();
		System.out.print(StaticSample.input);
		sample.num = 26;
	    StaticSample.input = 10;
	}

}
