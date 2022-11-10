package StringPrograms;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("String is Pallindrome");
		}
		else
			System.out.println("String is not pallindrome");

	}

}
