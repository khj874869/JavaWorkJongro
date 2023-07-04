package com.KH.day07.oop.Member;

import java.util.Scanner;

public class MemberFunction {
	private Member [] info;
	private static int index =0;

	public MemberFunction() {
		info = new Member[3];
		index = 0;
	}
	public int printmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========메인 메뉴===========");
		System.out.println("1.회원정보입력");
		System.out.println("2.화원정보출력");
		System.out.println("3.종료");
		System.out.print("선택 : " );
		int collect = sc.nextInt();
		return collect;
	}
	public void Inputinfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=========회원정보입력===========");
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 :");
		String memberPw = sc.next();
		System.out.println("이메일 : ");
		String memberEmail = sc.next();
		System.out.println("주소 : ");
		String memberAddrress= sc.next();
		info[index] = new Member (memberId,memberPw,memberEmail,memberAddrress);
		if(index <info.length -1) index++;
		
	}
	public void printInfo() {
		System.out.println("===회원정보 출력===");
		for(int i =0; i<index ; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고 , 이메일은 %s이며, 주소는 %s입니다.",info[i].getMemberId(),info[i].getMemberPw(),info[i].getMemberEmail(),info[i].getMemberAddress() );
		}
	}
}
