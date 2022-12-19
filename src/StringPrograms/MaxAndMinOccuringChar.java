package StringPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxAndMinOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jgjdfneknff";
	
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		int minChar=0,maxChar=0;
		char[] carr=str.toCharArray();
		for(int i=0;i<carr.length;i++) {
			int count=0;
			for(int j=0;j<carr.length;j++) {
				if(carr[i]==carr[j]) {
					count++;
				}
			}//System.out.println("count of char "+carr[i]+ " is: " +count);
			
				map.put(carr[i], count);
				maxChar=Collections.max(map.values());
				minChar=Collections.min(map.values());
				
				
		}System.out.println(map);
		//System.out.println(maxChar);
		for (Entry<Character, Integer> entry : map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxChar ){
                System.out.println("Max occuring char is: "+entry.getKey());     // Print the key with max value
            }
        }
		
		for (Entry<Character, Integer> entry : map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==minChar ){
                System.out.println("Min occuring char is: "+entry.getKey());     // Print the key with max value
            }
        }

	}

}
