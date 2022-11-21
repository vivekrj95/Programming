//
package StringPrograms;

import java.util.Scanner;

public class StringDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Vivek";
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		int length=str.length();
		if(length%n!=0) {
			System.out.println("String can't be divided into n equal parts");
		}
		else {
			for(int i=0;i<length;i++) {
				
			}
		}

		
	}

}
