package BasicPrograms;

import java.util.Scanner;

public class Armstrong {
	//method 1
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num,sum=0,rem;
//		int temp;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		num=sc.nextInt();
//		temp=num;
//		while(num>0) {
//			rem=num%10;
//			sum=sum+rem*rem*rem;
//			num=num/10;
//		}
//		System.out.println(sum);
//		if(temp==sum) {
//			System.out.println("Number is Armstrong");
//		}
//		else {
//			System.out.println("number is not Armstrong");
//		}
//
//	}
	
	//method 2
	static boolean isArmstrong(int num) {
		int temp,rem,sum=0;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			if(isArmstrong(i)) {
				System.out.println(i+" ");
			}
				
		}
	}
	
}
