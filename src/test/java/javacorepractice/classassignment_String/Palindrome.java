package javacorepractice.classassignment_String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String rev = "";
		
		
		int ss = s.length()-1;
		
		for(int i =ss;i>=0;i--){
			rev = rev + s.charAt(i);
		}
		if(s.contains(rev)) {
			System.out.println("String is Palindrome");
		} else
		{
			System.out.println("String is not Palindrome");
		}
	}
         
	}


