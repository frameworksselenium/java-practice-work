package javacorepractice.classassignment;

public class CheckPalindrome {

	public static void main(String[] args) {

		int num = 121;
		int rev = 0;
		int org_num = num;
		
		while(num!=0)
		{
			rev = rev*10+num%10; //1+0 1+1
			num = num/10;
		}
		if (rev==org_num)
			System.out.println("the number is palindrome");
		else
			System.out.println("the number is not palindrome");
	}
}
