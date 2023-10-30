package javacorepractice.classassignment;

public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int x:a) 
		{
			sum = sum+x;
		}
		
		System.out.println(sum);
	}

}
