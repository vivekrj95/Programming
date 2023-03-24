package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
//		map.put("City", "Mumbai");
//		map.put("City", "Pune");
		map.put("car", "4Wheeler");
		map.put("bike", "2Wheeler");
		
		
		for(int i=0;i<map.size()-1;i++) {
			System.out.println(map.values());
			System.out.println(map);
		}
	}

}

