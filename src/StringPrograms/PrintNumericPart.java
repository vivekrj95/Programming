package StringPrograms;

public class PrintNumericPart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="fd34jh123456";
		String[] arr=str.split("[A-Z,a-z]");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
