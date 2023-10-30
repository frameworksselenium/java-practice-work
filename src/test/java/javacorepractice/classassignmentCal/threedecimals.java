package javacorepractice.classassignmentCal;

public class threedecimals {
	
	double a,b,c;
	
	double sum(double a,double b,double c ) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		threedecimals res = new threedecimals();
		double z = res.sum(19.4, 13.5, 23.43);
		System.out.println(z);
	}

}
