package com.KH.day08.interfacepkg.zoo;

public class Zookeeper {
public void feed(Food predator) {
	System.out.println("feed" + predator.animalFood());
}
	//public void feed(Bear bear) {
//	System.out.print("feed Salmon" + bear.animalFood());
//}
//public void feed(Tiger tiger) {
//	System.out.print("feed beef" + tiger.animalFood());
//}
//	public void feed(Lion lion) {
//		System.out.print("feed gazel" + lion.animalFood());	
//	
//}
public static void main(String[] args) {
	Zookeeper zk = new Zookeeper();
	zk.feed(new Bear());
	zk.feed(new Tiger());
	zk.feed(new Lion());
}
}
