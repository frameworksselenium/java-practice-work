package javacorepractice.classassignment;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[] = {50,20,40,10,1000};
		
		/*System.out.println("Array elements before sorting" +Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting" +Arrays.toString(a));
		*/
		/*
		System.out.println("Array elements before sorting" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array elements after sorting" +Arrays.toString(a));
		*/
		
		Integer a[] = {50,20,40,10,1000};
		System.out.println("Array elements before sorting" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array elements after sorting" +Arrays.toString(a));
		

	}

}
