package javacorepractice.practicedatatypes;

public class Alphabets {

	public static void main(String[] args) {

		char c;
		
		String a = "a";

		for (c = 'b'; c <= 'z'; ++c) {
			a = a + c + ":";
		}

		System.out.println(a);

	}

}
