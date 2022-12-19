package arrayPrograms;

public class SecondLargestEle {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int largest;
		int secondLargest;
		int[] arr=new int[] {12,45,23,56,70};
		int len=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					secondLargest=arr[j];
					arr[j]=arr[i];
					arr[i]=secondLargest;
				}
			}
			
		}System.out.println(arr[len-2]);

	}

}
