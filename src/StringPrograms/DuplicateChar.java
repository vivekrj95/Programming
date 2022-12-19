package StringPrograms;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Viveke";
		for(int i=0;i<str.length();i++) {
			str=str.toLowerCase();
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(j));
				}
			}
		}

	}

}
