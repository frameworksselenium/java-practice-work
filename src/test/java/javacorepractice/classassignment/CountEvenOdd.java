package javacorepractice.classassignment;

public class CountEvenOdd {

	public static void main(String[] args) {

		int num = 23456;
		int rem;
		int evenNumbersCount = 0;
		int oddNumbersCount = 0;
		
		while (num>0){
			rem = num%10; // 6
			num = num/10;
			if(rem%2==0){
				evenNumbersCount++;
			}
			else{
				oddNumbersCount++;
			}
				
		}
		System.out.println("Number is even :" + evenNumbersCount);
		System.out.println("Number is odd : " + oddNumbersCount);

	}

}
