package javacorepractice.practiceArrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {90,98,76,54,17};
		
		int min = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					
					min = a[j];
				}
			}
		}
		System.out.println(min);
		}
	}
