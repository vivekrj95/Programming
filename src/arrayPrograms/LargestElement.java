package arrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {12,45,23,100,56,70};
		int len=arr.length;
		int largest;
		largest=arr[0];
		System.out.println("Largest element is: ");
		for(int i=0;i<len;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}System.out.print(+largest);

	}

}
