package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrime(int num) {
		int temp;
		if(num<=1) {
			System.out.println("not prime");
			return false;
		}
		int i=2;
		while(i<=num/2) {
			//System.out.println(num/2);
			if(num%i==0) {
				System.out.println("not prime");
				return false;
			}
		}			
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		PrimeNumber.isPrime(num);

	}

}
