package StringPrograms;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vivek";
		String str1="Raj";
		System.out.println("String before swapping: "+str+" "+str1);
		str=str+str1;
		
		str1=str.substring(0, (str.length()-str1.length()));
		//System.out.println(str1);
		str=str.substring(str1.length());
		System.out.println("Strings after swapping: "+str+ " "+str1);

	}

}
