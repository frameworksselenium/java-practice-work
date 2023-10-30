package javacorepractice.practiceArrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object a[] = new Object[4];
		
		a[0] = "ABC";
		a[1] = 12.5;
		a[2] = 'A';
		a[3] = 10;
		
		//System.out.println(a.length);
		//System.out.println(a[3]);
		
	/*	for(Object val:a) 
		{
			System.out.println(val);
		} */
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
