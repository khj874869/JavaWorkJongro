package homework;

public class StarCaffe extends Controller {
	@Override
	public void makeCoffee(int money) {
		if(money ==4000) {
			System.out.println("아메리카노 준비 해드리겠습니다.");
		}
		else if(money ==4500) {
			System.out.println("아이스 라떼 준비 해드리겠습니다.");
		}else {
			System.out.println("금액이 더 필요합니다");
		}
}
}
