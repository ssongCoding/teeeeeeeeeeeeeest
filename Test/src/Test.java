/*
 * #콜바이밸류 (Call By Value)
 */
class ClassA {
	void seven(int num) {
		num = num + 7;
	}
	
	void methodA() {
		int a = 3;
		seven(a);
		System.out.println(a);
	}
}


public class Test {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.methodA();
	}
}