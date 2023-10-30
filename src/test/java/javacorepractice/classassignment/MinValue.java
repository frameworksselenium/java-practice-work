package javacorepractice.classassignment;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {30,20,40,15,10};
		
		int min = a[0];
		
		for(int i=0; i<a.length;i++ )
		{
			if(a[i]<min)
				min = a[i];
		}
	
		System.out.println(min);
	}
	

}
