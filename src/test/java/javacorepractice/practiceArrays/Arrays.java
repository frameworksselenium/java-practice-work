package javacorepractice.practiceArrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		/*for(int i=0;i<a.length;i++)
			
		{
			//System.out.println(a[i]);
			System.out.println("Position "+i+" value is "+a[i]);
		}*/
		
		for(int x:a)               // Assigned all values to x
		{
			System.out.println(x);
		}
		}
		

}
