package arrayPrograms;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,20,15,25,50,40};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("THIRD LARGEST ELEMENT IS: ");
		System.out.print(arr[arr.length-4]);
		

	}

}
