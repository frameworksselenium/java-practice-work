package javacorepractice.practiceArrays;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {10,40,5,700,300};
		
		int max = a[0];
		//boolean flag = false;
		
		for(int  i=1;i<a.length;i++) { //10
			 
				
				if (a[i]>max) {
					
					//flag = true;
					
					max = a[i];
					
					//System.out.println(a[i]);

						
					}
					
				
			}
		
		System.out.println(max);
		}
		

	}


