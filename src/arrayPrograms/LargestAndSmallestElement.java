package arrayPrograms;

public class LargestAndSmallestElement {
	public static void main(String[] args) {
		int largest,smallest;
		int[] arr=new int[] {10,35,25,15,60,70};
		largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
		}System.out.println("largest element is: "+ largest);
		
		smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Smallest element is: "+ smallest);
	}

}
