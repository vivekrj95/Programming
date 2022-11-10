package StringPrograms;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automation is important";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)!= ' ') {
				count=count+1;
			}
		}System.out.println(count);

	}

}
