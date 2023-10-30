package javacorepractice.classassignmentCal;

public class ThreeIntegers {
	
	int a,b,c;
	
	
	int sum(int a,int b,int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeIntegers res = new ThreeIntegers();
		int z = res.sum(10, 20, 30);
		System.out.println(z);
		
		

	}

}
