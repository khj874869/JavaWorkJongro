package com.KH.day04.dimarray.exercise;

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

public void exercise5() 

{
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
}
