package javacorepractice.practicedatatypes;

import java.util.Scanner;

public class ReverseNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		StringBuilder sc = new StringBuilder();
		sc.append(num);
		StringBuilder rev = sc.reverse();
		
		System.out.println("The reverse number is "+rev);

	}

}
