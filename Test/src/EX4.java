class Fruit {
	String name = "과일";
	
	void printColor() {
		System.out.println("색깔");
	}
}

class Apple extends Fruit{
	String name = "사과";

	@Override
	void printColor() {
		super.printColor();
		System.out.println("빨간색");
	}
	
	void eat() {
		System.out.println("아이 맛있어");
	}
}

public class EX4 {
	public static void main(String[] args) {
		Apple apple = (Apple) new Fruit();
		Fruit a = new Apple();
		System.out.println(a.name);
		a.printColor();
		a.eat();
	}
}
