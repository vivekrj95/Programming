package arrayPrograms;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,20,30,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements og the array is: "+sum );

	}

}
