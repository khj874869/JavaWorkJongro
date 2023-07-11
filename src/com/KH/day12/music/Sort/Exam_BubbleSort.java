package com.KH.day12.music.Sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		
		int [] nums = {5,7,2,1,4};
		//bubble sort
		for(int i =0; i <nums.length -1;i++) {
			for(int j =0; j<(nums.length-1)-i;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] =nums[j];
					nums[j] = temp;
				}
			}
		}
		for(int i : nums) {
			System.out.print(i + " ");
		}
}
}