package com.KH.day02.loop.exercise;

public class Exercise_For1 {
	public static void main(String [] args)
	{
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
}
