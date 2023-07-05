package q6;

public class card {
	int cardNumber;
	static int SerialNumber=10000;
	 public  card () {
		 SerialNumber++;
		 cardNumber= SerialNumber;
	
	 }
	 public void printCardInfo() {
		 System.out.println(this.cardNumber+"입니다.");
	 }
}

