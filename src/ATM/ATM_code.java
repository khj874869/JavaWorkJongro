package ATM;

import java.util.Random;
import java.util.Scanner;

public class ATM_code {
	private double sum =0;
	private Casino cs = new Casino();
	public ATM_code() {
		cs = new Casino() ;
		sum = 0;
	}
	public int inputval() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("1.인출하기");
		 System.out.println("2.입금하기");
		 System.out.println("3.현잔액"); 
		 System.out.println("4.카지노"); 
		 System.out.println("5.나가기");
		 System.out.print("입력:");
		int input = sc.nextInt();
		return input;
		}
	public void outputCharge( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 인출 하시겠습니까?");
		int minus = sc.nextInt();
		sum = cs.charge - minus;
		System.out.println("현 잔액은" + sum + "입니다.");
	}
	public void inputCharge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 입금하시겠습니까?");
		int money = sc.nextInt();
		if(money > sum ) {
			System.out.print("한도가 초과되었습니다.");
		}else {
			sum += money; 
		}
		
	}
	public void now() {
		System.out.println("현재 있는 잔액은 "+ sum + "입니다.");
	}
	public int Casinogame() {		
			Scanner sc = new Scanner(System.in);
			System.out.println("==================Casino===============");
			System.out.println("1.사다리"); 
			System.out.println("2.블랙잭"); 
			System.out.println("3.러시안 룰렛"); 
			System.out.println("4.나가기"); 
			System.out.print("Press Button :");
			int collect = sc.nextInt();
			return collect;
			}			
	public void ledder() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("번호를 선택해주세요.");
		int select = sc.nextInt();
		if(select == r.nextInt(6)+1) {
			System.out.println("축하드립니다. 당첨 되셨습니다.");
			sum = sum*2;
		}else {
			System.out.println("아쉽게 됐습니다.");
			sum = sum - 3000;			
		}	
	}
	public void blackjack() {
		Random r = new Random();
		int Blackjack = 21;
		System.out.println("카드를 뽑아주세요.");
		int card = r.nextInt(20)+1;
		System.out.println("두번 째 카드를 뽑아주세요.");
		int card1 = r.nextInt(20)+1;
		int cards = (card + card1)-Blackjack;
		System.out.println("컴퓨터 차례입니다.");
		int comcard = r.nextInt(20)+1;
		System.out.println("컴퓨터가 두번째 카드를 뽑습니다.");
		int comcard1 = r.nextInt(20)+1;
		int comcards = (comcard + comcard1)-Blackjack;
		if(cards < comcards) {
			System.out.print("축하합니다. 당신의 승리입니다.");
			sum = sum * 1.5;
		}
		else {
			System.out.print("당신이 지셨습니다.");
			sum = sum -2000;
		}
	}

	public void russianRoullet() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int bullet = r.nextInt(5)+1;
		System.out.print("총알 번호를 선택해주세요.");
		int mebullet= sc.nextInt();
		System.out.println("총알을 장전합니다...");
		for(int i =0; i<bullet;i++) {
			if(bullet == mebullet) {
				cs.life = 0;
				System.out.print("당신은 사망하셨습니다. 생명 :" +cs.life);
			}else {
				sum = sum*4;
				System.out.print("축하합니다. 현 금액 :" + sum );
			}
			
		}
	}



}	

	
	
	

