package homework;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 입력");
		int input = sc.nextInt();
		for(int i = 1 ; i<=input ; i++) {
			for(int j =1 ; j<=input ; j++) {
				System.out.print("*");
				if(i%2 == 0 ) return;
				else if(i%3 ==0&&j%5==0) 
					System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
