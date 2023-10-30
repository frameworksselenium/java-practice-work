package javacorepractice.practicedatatypes;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
	//string buffer class;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse the number is " +rev);

	}

}
