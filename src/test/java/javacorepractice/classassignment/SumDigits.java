package javacorepractice.classassignment;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 1234;
		int sum = 0;
		int rem;
		
		while(num>0)
			
		{
			rem = num%10; // rem is 4
			sum = sum+rem; // 0+4 = 4
			num = num/10; // num is 123
		}
		
		System.out.println(sum);
		
	}

}
