package BasicPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a=0;
		int b=1;
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
