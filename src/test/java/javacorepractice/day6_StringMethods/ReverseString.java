package javacorepractice.day6_StringMethods;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="welcome";
		String rev="";
		
		int len=str.length();  //4
		
		for(int i=len-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+str.charAt(i);  //DCBA
		}

		System.out.println("Reverse string is:" +rev); //emoclew
		
		//CHECK PALINDROME OR NOT
		
		if(str.equals(rev))
		{
			System.out.println("Palindrom string...");
		}
		else
		{
			System.out.println("NOT Palindrom string...");
		}
	}

}
