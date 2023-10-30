package javacorepractice.practicedatatypes;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		System.out.println("Enter b number");
		int b = scan.nextInt();
		
		System.out.println("Enter c number");
		int c = scan.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("A is largest");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is largest");
		}
		
		else
		{
			System.out.println("C is largest");
		}
		}
	}



