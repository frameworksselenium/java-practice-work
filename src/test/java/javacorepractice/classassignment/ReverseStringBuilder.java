package javacorepractice.classassignment;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5678;
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		
		System.out.println(rev);

	}

}
