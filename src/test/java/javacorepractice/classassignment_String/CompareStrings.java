package javacorepractice.classassignment_String;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "welcome";
		String s2 = "WELCOME";
		
		System.out.println(s1.compareToIgnoreCase(s2));  //0 is the true  // 1 is false
		System.out.println(s1.equalsIgnoreCase(s2));     

	}

}
