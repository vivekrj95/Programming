package arrayPrograms;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest,secondSmallest=0;
		int[] arr=new int[] {1,2,15,10,23,19,50,60};
		System.out.println("Second Smallest element is : ");
//		smallest=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]<smallest) {
//				secondSmallest=smallest;
//				smallest=arr[i];
//		
//			}
//			else if(arr[i]<secondSmallest)
//			{
//				secondSmallest=arr[i];
//				
//			}
//		}
//		System.out.println(secondSmallest);

		//2nd method
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					smallest=arr[j];
					arr[j]=arr[i];
					arr[i]=smallest;
				}
					
			}
		}System.out.println(arr[1]);
		
	}

}
