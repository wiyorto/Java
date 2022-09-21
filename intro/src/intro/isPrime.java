package intro;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int number = s.nextInt();
	boolean isPrime=true ;
	if(number<2) {
		System.out.println("Please enter a proper number");
		return;
	}
	for (int i =2;i<number;i++) {
		if(number%i==0) {
			isPrime=false;
		}
		
	}
	if (isPrime) {
		System.out.println("The number is prime");
		
	}else {
		System.out.println("The number is not prime");
	}
	
	
	
	
	
	
	
	
	
	}
	}