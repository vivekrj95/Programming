package BasicPrograms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int temp, rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Number is pallindrome");
		}
		else {
			System.out.println("Number is not pallindrome");
		}

		
	}

}
