package com.KH.day03.array;

public class Exam_insertSort {
	public static void main (String [] args)
	{
		//삽입 정렬이란
		//정렬 알고리즘 중에 하나로 가장 간단하고 기본이 된다.
		//배열에 N번 인덱스 값을 0번에서 n-1번 인덱스까지 비교한다.
		//{2,5,4,1,3} 작은 값을 비교하여 왼쪽에 넣는다.
		//2하고 5는 2가 작은 값이기 때문에 바뀌지 않는다.
		// 5와 4는 4가 작기 때문에 4가 왼쪽으로 이동하고 5는 오른쪽으로 이동한다.
		//2번째 정렬 2,5,4,1,3 
		//3번째 정렬 2,4,5,1,3, 
		//4번째 정렬 2,4,1,5,3 
		//5번째 2,1,4,3,5
		//6번째 1,2,4,3,5
		//7번째 1,2,3,4,5
		int nums[] = {2,5,4,1,3};
		
		for(int j =1; j<nums.length;j++) {			
			for(int i = j; i>0; i--)
			{
				if(nums[i-1]>nums[i]) {
					int temp = nums[i];
					nums[i] = nums[i-1];
					nums[i-1] =temp;
				}
			}
			for(j=0;j<nums.length;j++) {
				System.out.print(nums[j]+" ");
			}
		}
		}
}



//삽입정렬이란?
//정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!!
//배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
//{2, 5, 4, 1, 3}
//1 : 2하고 5 비교 -> X
//{2, 5, 4, 1, 3} => 1번째 결과
//2 : 5하고 4 비교 -> 교환
//{2, 4, 5, 1, 3} => 2번째 결과
//3 : 5하고 1 비교 -> 교환
//{2, 4, 1, 5, 3}
//4하고 1 비교 -> 교환
//{2, 1, 4, 5, 3}
//2하고 1 비교 -> 교환
//{1, 2, 4, 5, 3} => 3번째 결과
//4 : 5하고 3 비교 -> 교환
//{1, 2, 4, 3, 5}
//4하고 3 비교 -> 교환
//{1, 2, 3, 4, 5} => 4번째 결과
//int [] arrs = {2, 5, 4, 1, 3};
//		//{2, 5, 4, 1, 3}
//		// j = 1
//		for(int j = 1; j < 1; j++) {
//			if(arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
		// j = 2
//		//{2, 4, 5, 1, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		// j = 3
//		//{2, 4, 5, 1, 3}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		//{2, 4, 1, 5, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		//{2, 1, 4, 5, 3}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		//{1, 2, 4, 5, 3}

//{2, 5, 4, 1, 3}
//j = 1
//if(arrs[0] > arrs[1]) {
//	int temp = arrs[1];
//	arrs[1] = arrs[0];
//	arrs[0] = temp;
//}		
////j = 2
////		//{2, 4, 5, 1, 3}
//if(arrs[1] > arrs[2]) {
//	int temp = arrs[2];
//	arrs[2] = arrs[1];
//	arrs[1] = temp;
//}
//if(arrs[0] > arrs[1]) {
//	int temp = arrs[1];
//	arrs[1] = arrs[0];
//	arrs[0] = temp;
//}
////j = 3
////		//{2, 4, 5, 1, 3}
//if(arrs[2] > arrs[3]) {
//	int temp = arrs[3];
//	arrs[3] = arrs[2];
//	arrs[2] = temp;
//}
////		//{2, 4, 1, 5, 3}
//if(arrs[1] > arrs[2]) {
//	int temp = arrs[2];
//	arrs[2] = arrs[1];
//	arrs[1] = temp;
//}
////		//{2, 1, 4, 5, 3}
//if(arrs[0] > arrs[1]) {
//	int temp = arrs[1];
//	arrs[1] = arrs[0];
//	arrs[0] = temp;
//}
////		//{1, 2, 4, 5, 3}
////j = 4
//if(arrs[3] > arrs[4]) {
//	int temp = arrs[3];
//	arrs[4] = arrs[3];
//	arrs[3] = temp;
//}
////{1, 2, 4, 3, 5}
//if(arrs[2] > arrs[3]) {
//	int temp = arrs[3];
//	arrs[3] = arrs[2];
//	arrs[2] = temp;
//}
////{1, 2, 3, 4, 5}
//if(arrs[1] > arrs[2]) {
//	int temp = arrs[2];
//	arrs[2] = arrs[1];
//	arrs[1] = temp;
//}
////{1, 2, 3, 4, 5}
//if(arrs[0] > arrs[1]) {
//	int temp = arrs[1];
//	arrs[1] = arrs[0];
//	arrs[0] = temp;
//}
//{1, 2, 3, 4, 5}