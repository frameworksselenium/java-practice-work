package javacorepractice.practiceArrays;

public class TwoDimensionEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a [] [] = { {10,100},
						{20,200},
						{30,300} };
		
		for(int x[]:a) 
		{
			for(int val : x)
			{
				System.out.print(val+ " ");
			}
			System.out.println();
		}
	}

}
