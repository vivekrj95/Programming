package BasicPrograms;

import java.util.Scanner;

public class DisplayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eter the end limit: ");
		b=sc.nextInt();
		while(num<=b) {
			if(num%2==0) {
				System.out.print(num +" ");
			}
			num++;
		}

	}

}
