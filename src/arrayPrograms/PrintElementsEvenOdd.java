package arrayPrograms;

public class PrintElementsEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,3,4,5,6,7,8,9};
		System.out.println("Elements at even place :");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Elements at odd place:");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
