package StringPrograms;

public class ReverseAlternateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am joining capgemini";
        String rev="";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            
            if(i%2!=0){
                int length=arr[i].length();
                
                for(int j=length-1;j>=0;j--){
                    rev=rev+arr[i].charAt(j);
                    
                }
                System.out.print(rev+ " ");
            }
            else{
                    System.out.print(arr[i] + " ");
                }
            
        }

	}

}
