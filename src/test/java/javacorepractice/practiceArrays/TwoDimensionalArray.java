package javacorepractice.practiceArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] [] = { {10,100},
						{20,200},
						{30,300} };
		
		System.out.println("Number of rows:"+a.length);
		System.out.println("Number of columns:"+a[0].length);
		System.out.println(a[2][1]);
		
		for(int r=0;r<a.length;r++)	
		{
			for (int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ " ");
			}
			
			System.out.println();
		}
		

	}
}

