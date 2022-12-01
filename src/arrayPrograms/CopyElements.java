package arrayPrograms;

public class CopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{1,6,5,10,11};
		int arr1[]=new int[arr.length];
		System.out.print("Elements of arr : ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			arr1[i]=arr[i];
		}
		System.out.println();
		System.out.print("Elements of arr1. : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}

	}

}
