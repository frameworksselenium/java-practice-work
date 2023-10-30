package javacorepractice.practiceArrays;

public class MinVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int a[] = {17,98,76,54,17};
		
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min) {
				
				min = a[i];
			}
		}

		System.out.println(min);
	}

}
