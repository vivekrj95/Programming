package StringPrograms;

public class PallindromeFunction {
	
	public static boolean isPallindrome(String str) {
		int length=str.length();
		String str1="";
		boolean result =false;
		for(int i=length-1;i>=0;i--) {
			//for(int j=0;j<length-1;j++) {
			str1=str1+str.charAt(i);
			}	
			if(str1.equals(str)) {
				result=true;
			}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PallindromeFunction pf= new PallindromeFunction();
		//String str="vivek";
		Boolean a=isPallindrome("vivek");
		Boolean b=isPallindrome("Abcba");
		System.out.println(b);
	}

}
