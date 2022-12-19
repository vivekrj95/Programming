package StringPrograms;

public class ReplaceLowercaseUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name IS Vivek";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			//Checks for lower case character  
			if(Character.isLowerCase(str.charAt(i))) {
				//Convert it into upper case using toUpperCase() function   
				sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			
		}
		System.out.println(sb);
		

	}

}
