package javacorepractice.day6_StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="welcome";
		//System.out.println(s);

		
		//length() - returns the length of the string
		System.out.println(s.length()); //7
		
		//concat() - join the strings
		
		System.out.println(1+3);
		System.out.println("abc"+"xyz");
		System.out.println("abc"+10);
		
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1+s2);
		System.out.println("welcome"+"to java");
		System.out.println(s1+" "+s2+"  "+s3);
		
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1.concat(s2).concat(s3)); //welcometo javaautomation
		System.out.println(s1.concat(" "+s2).concat(" "+s3)); //welcome to java automation
		
		
		//trim() - trim right & left side spaces.
		s="      Automation      ";
		System.out.println(s);
		System.out.println(s.length());//22
		
		System.out.println(s.trim().length()); //10
		
		
		//charAt() - - returns a single character based on the index
		s="welcome";
		
		System.out.println(s.charAt(3)); //c  3 is index, index is starts from 0
		
		//contains() -- returns a boolean value true/false
		s="Selenium";
		
		System.out.println(s.contains("Sel")); //true
		System.out.println(s.contains("Wel")); //false
		System.out.println(s.contains("n")); //true
		System.out.println(s.contains("sel")); //false
		
		//equals()   equalsIgnoreCase() --compare 2 strings 
		
		System.out.println(s.equals("Selenium")); //true
		System.out.println(s.equals("selenium")); //false
		System.out.println(s.equalsIgnoreCase("selenium")); //true
		
		System.out.println(s=="Selenium"); //true
		System.out.println(s=="selenium"); //false
		
		
		//replace() - replace single/ multiple/sequece of characters
		s="welcome to selenium automatin testing";
		
		System.out.println(s.replace('e', 'X')); //wXlcomX to sXlXnium automatin tXsting
		System.out.println(s.replace("selenium", "java")); //welcome to java automatin testing
		
		System.out.println(s.replace("selenium", "X")); //welcome to X automatin testing
		
		s="   welcome";
		
		System.out.println(s.replace("   ",""));
		
		//substring() - extract substring of the main string ( starting index, ending index)
		
		s="Welcome";
		
		System.out.println(s.substring(0, 3));//Wel
		
		System.out.println(s.substring(3, 7)); //come
		
		System.out.println(s.substring(1, 4)); //elc
		
		//toUpperCase()  & toLowerCase()
		
		s="WelCOME";
		
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
	}

}