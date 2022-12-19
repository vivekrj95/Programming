package StringPrograms;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Remove 	white spaces";
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\t') {
				sb.append(ch[i]);
			}
		}System.out.println(sb);
		String s=sb.toString();
		System.out.println(s);

	}

}
