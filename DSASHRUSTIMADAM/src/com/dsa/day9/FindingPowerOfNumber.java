package com.dsa.day9;

import java.util.Scanner;

public class FindingPowerOfNumber {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please the enter the number to multiply :");
		int a=scanner.nextInt();
		System.out.println("Please the enter the power to multiply :");
		int b=scanner.nextInt();
		
		int powerOfNumber = PowerOfNumber(a,b);
		System.out.println("Power Of Number :"+powerOfNumber);

		
	}

	private static int PowerOfNumber(int a, int b) {
		
		int powerOfNumber=1;
		
		for(int i=0;i<b;i++) {
			
			
			
			powerOfNumber=powerOfNumber*a;
		}
		
		return powerOfNumber;
		
	}

}
