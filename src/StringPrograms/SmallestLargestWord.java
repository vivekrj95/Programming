package StringPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class SmallestLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Favriote sport is Cricket";
		String[] arrayStr=str.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int smaller=0,larger=0;
		int[] arr=new int[arrayStr.length];
		for(int i=0;i<arrayStr.length;i++) {
			int len=arrayStr[i].length();
			System.out.print(len+" ");
			arr[i]=len;
			map.put(arrayStr[i], len);
			smaller=Collections.min(map.values());
			larger=Collections.max(map.values());
			
			}
		System.out.println(map);
		//System.out.println(larger);	
		for(Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()==smaller) {
				System.out.println("Smaller word of the String is :"+entry.getKey());
			}
			
			else if(entry.getValue()==larger) {
				System.out.println("Larger word of the String is :"+entry.getKey());
			}
		}
		
		

	}

}
