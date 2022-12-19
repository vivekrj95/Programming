package StringPrograms;

import java.util.Arrays;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="big black bug bit a big black dog on his big black nose";
		int count;
		String[] arr=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr[j]="0";
				}
				
			}
			if(count>1 && arr[i]!="0")
				System.out.println(arr[i]);
			
		}

	}

}
