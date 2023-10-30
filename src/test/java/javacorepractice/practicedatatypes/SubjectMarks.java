package javacorepractice.practicedatatypes;

public class SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maths = 50;
		int science = 40;
		int social = 50;
		int sum = maths + science + social;

		if (maths >= 35 && science >= 35 && social >= 35) {
			System.out.println("pass");
			if (sum >= 180) {
				System.out.println("firstclass");
			} else if (sum >= 150 && sum < 180) {
				System.out.println("secondclass");
			} else if (sum >= 105 && sum < 150) {
				System.out.println("third class");
			}
		} else {
			System.out.println("fail");
			if (maths >= 35) {
				System.out.println("Math Passed and him or her marks : '" + maths + "'");
			} else if (science >= 35) {
				System.out.println("Math Passed and him or her marks : '" + science + "'");
			} else if (social >= 35) {
				System.out.println("Math Passed and him or her marks : '" + social + "'");
			}

		}

	}

}
