package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListOfStringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");
		list.add("XYZ");
		list.add("viv");
		list.add("swap");
		
		System.out.print("Before swapping :"+list);
		System.out.println();
		
		//Collections.sort(list);
		//System.out.print(list);
		int count=list.size();
		String temp;
		Object[] ob=list.toArray();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				
			}
		}
		
	}

}
