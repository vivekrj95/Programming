package arrayPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,4,5,3,2,5,7,4,8};
        for(int i=0;i<arr.length;i++) {
        	for(int j=1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
            		System.out.println(arr[i]);
            	}
        		else {
        			break;
        		}
        	}
        	
        }
		
	}

}
