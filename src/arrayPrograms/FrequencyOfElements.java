package arrayPrograms;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,2,4,5,10,2,3,5,6,5,2,3,4,7,6,3};
		int[] freq=new int[arr.length];
		int visited=-1;
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					//To avoid counting the same element
					freq[j]=visited;
				}
				
			}
			if(freq[i]!=visited) 
				freq[i]=count;
			
			
			
//			System.out.println("Frequency of "+arr[i]+ ":"+count);
//			if(count==1) {
//				System.out.println(arr[i]);
//			}
			
		}for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited)
				System.out.println("frequency of "+arr[i]+ "is :"+freq[i]);
		}

	}

}
