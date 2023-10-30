package javacorepractice.classassignment;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {100,20,300,40,50};
		int max = a[0];
		
		for(int x:a)
		{
			if (x>max)
			 max = x;
			
		}
		System.out.println(max);
	}

}
