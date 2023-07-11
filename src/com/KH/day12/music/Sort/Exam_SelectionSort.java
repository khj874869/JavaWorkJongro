package com.KH.day12.music.Sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		int[] nums = {5,7,2,1,4};
		//5,7,2,1,4
		//1,7,2,5,4
		//1,2,7,5,4
		//1,2,4,5,7
		//선택정렬
		int min;
		for(int i=0 ; i<nums.length; i++) {
			min = i;
			for(int j=i+1 ; j<nums.length; j++) {
			 if(nums[min] > nums[j]) {
				 min = j;
			 }		 
			}
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] =temp;
			}
		for(int i : nums) {
			System.out.print(i+ " ");
		}
		}
	}

