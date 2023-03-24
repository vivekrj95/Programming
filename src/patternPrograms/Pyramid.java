package patternPrograms;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,columns=5;
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=columns;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//reverse 	
		int rows1=5;
		for(int i=1;i<=rows1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
