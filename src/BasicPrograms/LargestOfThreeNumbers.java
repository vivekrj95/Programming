package BasicPrograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c=1;
		if(a>=b && a>=c) {
			System.out.println("a is largest");
			
		}
		else if(b>=a && c>=b) {
			System.out.println("c is largest");
		}
		else {
			System.out.println("b is largest");
		}

	}

}
