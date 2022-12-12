package arrayPrograms;

public class RightRotateElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,5,7,5,10,9};
		int length= arr.length;
		int n=3; //n determine the number of times an array should be rotated. 
		System.out.println("original array: ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int last=arr[length-1];
			for(int j=length-1;i>0;i--) {
				arr[j]=arr[j-1];
			
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.println("array after rotation : ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
