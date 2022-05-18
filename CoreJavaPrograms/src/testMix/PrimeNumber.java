package testMix;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 10;
		
		boolean isFlag = false;
		
		if(number % 2 != 0) {
			isFlag = true;
		}
		
		if(isFlag) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}
	}

}
