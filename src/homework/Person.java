package homework;
	class Person  {
		private String name; 
		private int money; 
		public void Person() {
			
		}
		public Person(String name, int money) {
			this.name = name;
			this.money = money;
		}
		public void buyCoffe(Controller caffe, int money) {
			this.money -= money;
			caffe.makeCoffee(money);
		}
		public void printInfo() {
			System.out.println(this.name +"님의 잔액은" + this.money + "원 입니다.");
		}
	}