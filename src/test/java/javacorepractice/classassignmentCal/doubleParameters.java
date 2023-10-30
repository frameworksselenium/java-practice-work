package javacorepractice.classassignmentCal;

public class doubleParameters {
	
	double x,y;
	
	double sum(double x, double y) {
		this.x=x;
		this.y=y;
		
		return(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doubleParameters res = new doubleParameters();
		double z = res.sum(18.32, 14.5);
		
		System.out.println(z);          
		

	}

}
