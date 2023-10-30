package javacorepractice.classassignment;

public class CountDigits {

	public static void main(String[] args) {

		int num = 423424;
		int i=0;
		while (num>0){
			num = num/10;
			 i++;
		}
		System.out.println(i);
	}
}
