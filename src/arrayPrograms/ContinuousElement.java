package arrayPrograms;

import java.util.Arrays;
//given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

public class ContinuousElement {
	public static void main(String[] args) {
		int[] A= {1, 3};
		 Arrays.sort(A);
	       int num=1;
	       for(int i=0;i<A.length;i++){
	           if(A[i]==num)
	               num++;
	               
	           

	       }
	       System.out.println(num);
	       //return num;
	
	}
}
