package arrayPrograms;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,2,4,5,10,2,3,5,6,5,2,3,4,7,6,3};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}System.out.println("Frequency of "+arr[i]+ ":"+count);
			
		}

	}

}
