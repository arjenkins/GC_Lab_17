package primeNumbers;
import java.util.Scanner;

public class GCLab17 {
	
	
	
	public static void main (String[]args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Let's locate some primes!");
		
		System.out.println("Enter a prime number: ");
		int num = scnr.nextInt();
		
		System.out.println("The number " + num + "prime is " + getNthPrime(num));

		
		
	}
	public static int getNthPrime(int num) {
	
	
	
	int nthPrime = 1;
	int currentPrime = 2;

	while (nthPrime != num) {
		currentPrime++;

		if (isPrime(currentPrime)) {
			nthPrime++;
		}
	}

	return currentPrime;
}

private static boolean isPrime(int currentPrime) {
	if (currentPrime > 2 && currentPrime % 2 == 0) {
		return false;
	}
	for (int i = 3; i <= Math.sqrt(currentPrime); i += 2) {
		if (currentPrime % i == 0) {
			return false;
		}
	}

	return true;

}

}




