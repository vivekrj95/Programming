package arrayPrograms;

public class PrintElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {5,10,15,20,25,10};
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//print in reverse order
		System.out.println("Array in reverse order:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
