package javacorepractice.classassignment;

public class PrintNumbersEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6};
		int EvenCount = 0;
		int OddCount = 0;
		
		for(int x: a)
		{
			if (x%2==0)
				EvenCount++;
			//System.out.println("EvenCount");
			else
				OddCount++;
			//System.out.println("OddCount");
			
		}
		
		System.out.println(EvenCount);
		System.out.println(OddCount);
		
		
	}

}
