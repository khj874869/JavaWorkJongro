package com.KH.day03.array.exercise;

import java.util.Scanner;

public class Exercise_for {
	public void exersice1() {
		 int num = 1;
	     int sum = 0;
	     while(num <=10){
	      sum += num;
	       if(num<10){
	        System.out.print(num+"+");
	        }else{
	          System.out.print(num+"=");
	        }
	          num++;
	         
	      }
	     System.out.println(sum);
	}
public void exercise2() {
	Scanner sc= new Scanner(System.in);
System.out.print("1~9까지의 수를 입력하세요.");
int i = sc.nextInt();
if(i>0 && i<10) {
	for(int j =1;j<10;j++) {
		System.out.println(i+"*"+j+"="+i*j);

	}

}
else {
   System.out.print("1부터 9까지의 숫자만 입력하세요.");
}
	
}

public void for_double_exercise() {
	for(int h = 1 ; h<10 ; h++) {
		for(int k =2 ; k<10 ;k++)  {
			System.out.print(k+"*" + h  + "=" + k*h + "\t");
		}
		System.out.println();
		}
}

public void for_double_exercise2() {
	{
		for(int i=0; i<24 ; i++) {
			for(int j=0;j<60;j++) {
				System.out.printf("%2d시 %2d분\n",i,j);
			}
		}
}
}

public void for_double_exercise3() {
	{
		for(int i =0 ; i <=10 ;i ++) {
			for(int j =0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			}
		}

public void while1_exercise1() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 하나 입력:");
	int num = sc.nextInt();	
	int sum =0;
	while(num != -1)
	{
		sum += num;
	System.out.print("정수 하나 입력:");
	num = sc.nextInt();
	
}
	System.out.print("입력하신 수의 합은:" + sum);	
	
}

public void while2_exercise2() {
	 int i=1;
	  int sum=1;
	  while(i<99){
	   i+=2;
	   sum+=i;
	  }
	  System.out.println(sum);
}
}

