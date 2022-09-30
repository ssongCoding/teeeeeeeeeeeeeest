import java.util.Scanner;

public class Test_220927 {
	public static void main(String[] args) {
		
		/*
		 * 예제 1-2. 
		 */
		int score = 68;
				
		// score / 10 
		switch(   ) {
			
		}
		
		
		if(score >= 75) {
			System.out.println("C+");
		} else if(score >= 70) { // && < 75
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
		/*
		 * 예제 1-1. 100 미만 3의 배수 정수들의 합
		 * i%3==0 을 사용하지 않고 방법이 있을까요?
		 */
		int sum = 0;
		for (int i = 0; i < 100; i+=3) {
				sum += i;
		}
		
		System.out.println(sum);
	}

}
