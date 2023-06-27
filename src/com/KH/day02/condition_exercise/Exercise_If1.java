package com.KH.day02.condition_exercise;
import java.util.Scanner;
public interface Exercise_If1 {
	public static void main(String [] args)
	{
		//점수와 학년을 입력 받아 60점 이상이면 합격,
		//미만이면 불합격을 출력한다. 
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요:");
		int score = sc.nextInt();
		System.out.print("학년을 입력해주세요(1~4).:");
		int compart = sc.nextInt();
		if(score>=60)
		{if(compart !=4) {
			System.out.print("합격입니다.");
		}else if( score>=70){
			System.out.println("합격입니다.");
			
		}else {System.out.print("불합격입니다.");
		}
		}
		else {
			System.out.print("불합격입니다.");
		}
	}
}
