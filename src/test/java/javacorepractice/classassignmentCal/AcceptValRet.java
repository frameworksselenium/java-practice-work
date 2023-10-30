package javacorepractice.classassignmentCal;

public class AcceptValRet {
	
	int a;
	int b;
	
	 int m1(int a, int b) {
		 
		 this.a =a;
		 this.b =b;
		 
		return a+b;
	
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcceptValRet ret = new AcceptValRet();
		ret.a = 100;
		ret.b = 200;
		int z = ret.m1(100, 200);
		
		System.out.println(z);

	}

}
