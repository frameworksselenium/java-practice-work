package javacorepractice.day6_StringMethods;

public class SearchingStringinArray {

	public static void main(String[] args) {
	
		String emp_names[]= {"David","Scott","Smith","Scott","John"};
		
		String search_name="Scott";
		
		boolean flag=false;
		
		for(String n:emp_names)
		{
			if(n.equals(search_name))
			{
				System.out.println("Name found");
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
		{
		System.out.println("Name Not found");
		}
		
	}

}
