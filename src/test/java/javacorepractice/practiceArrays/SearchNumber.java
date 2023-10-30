package javacorepractice.practiceArrays;

public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };
		int b = 30;
		boolean flag = false;

		for (int x : a) {
			if (x == b) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Element is  found");
		}else if (flag == false) {
			System.out.println("Element is  not found");
		}

	}
}
