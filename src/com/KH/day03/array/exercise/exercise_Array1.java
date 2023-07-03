package com.KH.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class exercise_Array1 {
	public void exercise1() {
			//양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
			Scanner sc = new Scanner(System.in);
			int [] numbers = new int [5];
			int max = 0;
			for(int i =0; i<numbers.length ; i++ ) {
				System.out.print("양수 하나 입력");
				int num = sc.nextInt();		
				numbers[i] = num;
				if(numbers[i]>max) //입력 받은 값보다 더 클때
				{
					max = numbers[i];		
				}
			}
			System.out.println("가장 큰 수는" + max + "입니다.");
	}
			public void exercise2() {
				int [] num = new int [5];
				int avg = 0;
				Scanner sc = new Scanner(System.in);
				for(int i = 0; i < num.length;i++) {
					num[i] = sc.nextInt();
					avg += num[i];
				}
				System.out.print("평균 : " + (double)avg/num.length);
			}
			
			
			public static void main(String [] args){
			
		}
			public void arryCopyExercies() {
				char [] no = new char[14];
				char [] no2 = new char[14];
				Scanner sc = new Scanner(System.in);
				System.out.print("주민번호입력:");
				String memberNum = sc.next();
				for(int i=0;i<no.length;i++) {
					
					no[i] =memberNum.charAt(i);
					
				}
				for(int j=0;j<no.length;j++) {
					if( j<8) {
						
						no2[j] = no[j];
					}else {
						no2[j] = '*';
					}
				}
				for(int j = 0; j<no2.length;j++)
				{
					System.out.print(no2[j]);

				}
			}
			public void practice11() {
				Random rand = new Random();
				int [] num = new int [45];
				for(int i =1 ; i<num.length;i++) {
					num[i] =rand.nextInt(i);
				}
				for(int j =1 ; j<=6 ; j++) {
					System.out.print(num[j] + " ");
				}
			}
			public void example1() {
				Scanner sc = new Scanner(System.in);
				System.out.print("값을 입력해주세요.:");
				int input = sc.nextInt();
					if(input<1) {
						System.out.print("1 이상의 숫자를 입력해주세요.");
					} else {
						for(int i =1;i<=input;i++) {				
						System.out.print(i + " ");	
					}
					
				}
}
			public void example2() {
				Scanner sc = new Scanner(System.in);
				System.out.println("값을 입력해주세요.:");
				int number = sc.nextInt();
				for(int j = number; j>0;j--) 
				{
					if(number > 1 || number ==1) {						
						System.out.print(j + " ");
					}
				}
					
			}
			public void example3() {
				Scanner sc = new Scanner(System.in);
				System.out.print("값을 입력하시오.");
				int input = sc.nextInt();
				int sum =0;
				for(int i=1;i<=input;i++)
				{
					sum += i;
				}
				System.out.print(sum + " ");
			}
			public void example4() {
				Scanner sc = new Scanner(System.in);
				System.out.print("값을 입력하세요.");
				int num1 = sc.nextInt();
				System.out.print("두번 째 값을 입력하세요.");
				int num2 = sc.nextInt();
				if(num1<1 || num2<1) {
				System.out.print("1 이상의 숫자를 입력하세요.");
				}else {
				System.out.print(num1 + "," + num2);
				}
			}
			public void example5() 
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("단 수를 입력하세요.:");
				int dan = sc.nextInt();
				for(int i =1; i<10 ; i++)
				{
					System.out.println(dan + "*"+ i + "=" + dan*i);
				}
			}
			public void example6() {

				Scanner sc = new Scanner(System.in);
				System.out.print("단 수를 입력하세요.:");
				int dan = sc.nextInt();
				for(int j = dan ; j<10;j++) {
					for(int i =1 ; i<10;i++) {
						System.out.println(j+"*"+i + "="+j*i);
					}
				}
			}
			public void randgame() 
			{
				Scanner sc = new Scanner(System.in);
				Random rand = new Random();
				int j = rand.nextInt(3);
				System.out.print("숫자를 입력하세요.1.가위2.바위3.보");
				int rock = sc.nextInt();
				for(int i=0;i<5 ;i++)
				{ if(rock ==1 && rand.nextInt(3) == 3 ) 
					{
						System.out.print("당신이 이겼습니다");
						
					}else if (rock ==1 && rand.nextInt(3) == 2 ) 
					{
						System.out.print("당신이 졌습니다.");
					}
				if(rock ==2 && rand.nextInt(3) == 1 ) 
				{
					System.out.print("당신이 이겼습니다");
					
				}else if (rock ==2 && rand.nextInt(3) == 3 ) 
				{
					System.out.print("당신이 졌습니다.");
				}
				else if (rock ==3 && rand.nextInt(3) == 1 ) 
				{
					System.out.print("당신이 졌습니다.");
				} 
				}
			}
			public void BaskinRobbins31() {
				Random r = new Random();
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				r.nextInt(3);
				int sum = 0;
			
						
					}
				
			public void lottoExercise() {
				int [] lottoNums = new int[6];
				Random r = new Random();
//				int count = 1;
				for(int i=0; i<lottoNums.length;i++) {					
					lottoNums[i]=r.nextInt(45)+1;
					for(int j =0;j<i;j++) {						
						if(lottoNums[i] == lottoNums[j]) {
							i--;
							break;
						}
					}
				}
//				check++;
				for(int i = 0 ; i<lottoNums.length-1 ; i++) {
					for(int j = 0 ; j<(lottoNums.length-1)-i ; j++) {						
						if(lottoNums[j]>lottoNums[j+1]) {
							int check=lottoNums[j]  ;
							lottoNums[j] = lottoNums[j+1];
							lottoNums[j] = check;
						}
					}
				}
				for(int i =0; i <lottoNums.length;i++) {					
					System.out.print(lottoNums[i] + " ");					
				}
				
			}
			
		public void practice1() {
			int []num = new int [10];
			int k =1;
			for(int i=0;i<num.length;i++) {
				num[i] = k;
				k++;
			}
			for(int i = 0 ; i<num.length;i++) {
				System.out.print(num[i] + " ");
			}
		}
			
		public void practice2() {
			int []num = new int [10];
			for(int i=num.length-1;i>=0;i--) {
				num[i] = i+1;
				
			}
			for(int i=num.length-1;i>=0;i--) {
				System.out.print(num[i] + " ");
			}
		}

		public void practice3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력:");
			int input = sc.nextInt();
			int [] num = new int [input];
			int k = 1;
			for(int i = 0; i<num.length ; i++) {
				num[i] = k;
				k++;
			}
			for(int i = 0; i<num.length ; i++) {
				System.out.print(num[i] + " ");}
		}

		public void practice4() {
			String [] str = {"사과","귤","포도","복숭아","참외"};
			System.out.print(str[1]);
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자입력");
			String str = sc.next();
			char ch = str.charAt(0); 
		}
}




