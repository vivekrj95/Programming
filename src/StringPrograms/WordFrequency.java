package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "india is beautiful india is great";
		String[] arr= str.split(" ");
		
		
		List<String> arrList = new ArrayList<>();
		//System.out.println(arrList);
		for(int i=0;i<arr.length;i++) {
			int count=0;
			arrList.add(arr[i]);
			if(arrList.get(i) == arrList.get(i)) {
				count++;
			}System.out.println(count);
		}
		System.out.println(arrList);
		

	}

}
