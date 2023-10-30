package javacorepractice.classassignment_String;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Krishna Reddy Manubolu";
		String [] s = str.split("R");
		
		for(String val: s)
		{
			System.out.println(val);
		}
		
		
		String s1 = "Krishna";
		String s2 = "KRISHNA";
		
		//boolean s3 = s1.contains(s2);
		if(s1.contains(s2)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");

		}
	}

}
