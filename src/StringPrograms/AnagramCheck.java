package StringPrograms;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Race5";
		str1=str1.toLowerCase();
		String str2="Care3";
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not Anagram");
		}
		else {
		char[] charStr1=str1.toCharArray();
		char[] charStr2=str2.toCharArray();
		Arrays.sort(charStr1);
		Arrays.sort(charStr2);
		//method 1:
		
//		for(int i=0;i<charStr1.length;i++) {
//			for(int j=0;j<charStr2.length;j++) {
//				if(charStr1[i]==charStr2[j]) {
//					break;
//					
//				}
//			}
//		}
		//method 2:
		if(Arrays.equals(charStr1, charStr2)) {
			System.out.println("strings are Anagram");
		}
		else {
		System.out.println("Strings are not Anagram");
		}
		}
	}

}
