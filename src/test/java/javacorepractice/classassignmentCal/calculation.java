package javacorepractice.classassignmentCal;

public class calculation {
	 int a,b,c;
	 double x,y,z;
	 
	 int sum(int a,int b) {
		 
		 this.a = a;
		 this.b = b;
		 return a+b;
	 }
	 
	 int sum(int a,int b, int c) {
		 
		 this.a = a;
		 this.b = b;
		 this.c = c;
		 return a+b+c;
	 }
	 	double sum(double x,double y) {
		 
		 this.x = x;
		 this.y = y;
		 return x+y;
	 }
	 
double sum(double x,double y, double z) {
		 
		 this.x = x;
		 this.y = y;
		 this.z = z;
		 return x+y+z;
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculation cal = new calculation();
		int z = cal.sum(10, 30);
		System.out.println(z);
		int x = cal.sum(10, 10, 10);
		System.out.println(x);
		double r = cal.sum(19.4, 34.5);
		System.out.println(r);
		double p = cal.sum(32.4, 45.3, 21.4);
		System.out.println(p);
		

	}

}
