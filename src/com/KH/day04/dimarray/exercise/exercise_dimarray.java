package com.KH.day04.dimarray.exercise;

import java.util.Random;
import java.util.Scanner;

public class exercise_dimarray {
	public void exercise1() 
	{
		int nums[][] = new int [5][5]; 
		int k =4; 
		int s = 25; 
		for(int i = k ;i>=0;i-- ) 
		{for(int j =0 ; j<nums.length;j++) {
			nums[i][j] = s;
			s--;
		}
		}
		for(int i= 0 ;i<nums.length;i++ ) {
			for(int j =0 ; j<nums.length;j++)	{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();}
	}
	public void exercise2()
	{
	int [][]arrs = new int [5][5];
	int k = 1;
	for(int j = 0; j<arrs.length;j++)
	for(int h = arrs.length-1; h>=0 ; h--) {
		arrs[h][j] = k;
		k++;
	}
	for(int j= 0 ;j<arrs.length;j++ ) {
		for(int h =0 ; h<arrs.length;j++)	{
			System.out.print(arrs[j][h] + " ");
		}
		System.out.println();}
}
	
	
	public void exercise3() 
	{
		int nums[][] = new int [5][5];
		int k =1;
		for(int i= 0 ;i<nums.length;i++) {
			for(int j =0; j<nums.length;j++) {
				nums[j][i] = k;
				k++;
							
			}
		}
		for(int i= 0 ;i<nums.length;i++ ) {
			for(int j =0 ; j<nums.length;j++)	{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();}
	}
	
	public void exercise4() 
	{
	int nums[][] =new int[5][5];
	int k = 1;
	for(int i = 0; i<nums.length;i++) {
		if(i%2==0) {
			for(int j=0;j<nums.length;j++) {
			nums[i][j] = k;
			k++;}
		}else {
				for(int j=4;j>=0;j--) {
					nums[i][j] = k;
					k++;
				}
			}
	}
	for(int i= 0 ;i<nums.length;i++ ) {
		for(int j =0 ; j<nums.length;j++)	{
			System.out.print(nums[i][j] + " ");
		}
		System.out.println();}
	}

public void exercise5() {
	double sum=0;
	double [][] nums = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
	for(int j =0 ; j<nums.length;j++) {
		for(int i =0;i<nums[j].length;i++) {
//			System.out.printf("%.1f", nums[j][i]);
			sum += nums[j][i];
		}
	System.out.println();
	}
	int forthLength = nums.length;
	int backlength = nums[0].length;
	double result = sum /(forthLength * backlength);
	System.out.printf("4년 전체 평점 평균은 : %.2f\n",result);
}
public void exercise6()
{
	while(true) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();	
	System.out.print("배열1 입력");
	int a = sc.nextInt();
	System.out.print("배열2 입력");
	int b = sc.nextInt();
	int [][] nums = new int [a][b];
	if(a<=10&&b<=10) {		
		for(int i =0;i<nums.length;i++) {
			for(int j =0 ; j<nums.length;j++) {
				
				nums[i][j] =  r.nextInt(96)+1;
			}
		}
		}else {
			System.out.print("반드시 1~10사이의 숫자를 입력해야 됩니다.");
			sc.next();
			
		}
		
		for(int i =0;i<nums.length;i++) {
			
			for(int j =0 ; j<nums.length;j++) {
				System.out.print((char)nums[i][j] + " ");
			}
		
	} 
	
		
	
	}
	}

public void exercise7() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정사각행렬의 사이즈를 입력하시오");
	int a = sc.nextInt();
	System.out.print("2차원 배열 크기 입력");
	int b = sc.nextInt();
	int [][] nums = new int[a][b];
	int k = 1;
	for(int j= nums.length-1 ; j>=0;j--) {		
		nums[0][j] =k;
		k++;
	}
	for(int i =1;i<nums.length;i++) {
		nums[i][0] = k;
		k++;
	}
	for(int j=1 ;j<nums.length;j++ ) {
		nums[4][j] =k;
		k++;
	}
	for(int j =nums.length-1;j>=1;j--) {
	nums[3][j] = k;
	k++;
}
	for(int j=1 ;j<nums.length;j++ ) {
		nums[2][j] =k;
		k++;
	}
	for(int j =nums.length-1;j>=1;j--) {
		nums[1][j] = k;
		k++;
	}
	
 for(int i =0 ; i<nums.length; i++) {
	 for(int j =0 ; j<nums.length; j++) {
		 System.out.print(nums[i][j] + " ");
	 }
	 	System.out.println();
 }
}
}

