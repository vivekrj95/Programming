package arrayPrograms;

public class SortingAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {90,45,69,15,100};
		
		int temp=0;
		System.out.println("Original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements of sorted array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
