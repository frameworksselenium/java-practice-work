
package javacorepractice.practicedatatypes;

public class swap {

	public static void main(String[] args) {
		 int a = 100;
		 int b = 500;
		System.out.println("A value is before swapping  :" + a);
		System.out.println("B value is before swapping  :" + b);
		int temp;

		temp = a; //100
		a = b;
		b = temp;
		
		System.out.println("A value is after swapping  :" + a);
		System.out.println("B value is after swapping  :" + b);
	}
}
