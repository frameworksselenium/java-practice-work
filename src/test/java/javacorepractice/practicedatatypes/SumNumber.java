package javacorepractice.practicedatatypes;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		
		int sum = 0;
		
		while (num>0)
			
		{
			sum =sum+num%10; // 5 reminder
			num = num/10;
		}
		
		System.out.println(sum);
		
	}

}
