package eman.study;

public class Calculate {
private boolean isPrime = false;
	
	public Calculate() {
		
	}
	
	public boolean isPrime(int num) {
		System.out.println("Calculating prime....");
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}
}
