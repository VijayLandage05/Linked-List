package com.interviewquestions.main;

import java.util.Scanner;

public class CheckPPrimeNumber {
	
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is a prime number ");
		}else {
			System.out.println(n + " is not a prime number ");
		}
	}

}
