package arrayPrograms;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest;
		int[] arr=new int[] {5,2,6,9,15};
		System.out.println("Smallest element is: ");
		smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println(smallest);

	}

}
