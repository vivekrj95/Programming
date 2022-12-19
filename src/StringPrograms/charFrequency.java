package StringPrograms;

public class charFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Vivek";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			str=str.toLowerCase();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println("Frequency of charactor "+str.charAt(i)+" is :"+count);
		}

	}

}
