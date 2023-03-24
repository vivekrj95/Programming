package arrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenAndAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(5);
		list.add(16);
		for(int i=0;i<list.size();i++){
		    //System.out.print(list.get(i)+ " ");
			if(list.get(i)%2==0) {
				Collections.sort(list);
				System.out.print(list.get(i)+ " ");
			}
		}	       
	}

}
