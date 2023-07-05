package homework;

public class model {

	public static void main(String[] args) {
		Person Kim = new Person("김씨",10000);
		Kim.buyCoffe(new StarCaffe(),4000);
		Kim.printInfo();
		Person lee = new Person("이씨",20000);
		lee.buyCoffe(new StarCaffe(),4500);
		lee.printInfo();
	}

public static void out() {
	System.out.println("시스템 종료");
}
}
