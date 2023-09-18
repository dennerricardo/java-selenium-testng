package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
//		for(int j=0; j< arr2.length; j++ ) 
//		{
//			if (arr2[j] % 2 == 0)
//			{
//				System.out.println(arr2[j]);
//			}
//			else
//			{
//				System.out.println(arr2[j]+" is not multiple of 2");
//			}
//		}
		
		ArrayList<String> a = new ArrayList<String>();
		
		// create a object of the class - object.method 
		a.add("denner");
		a.add("denner2");
		a.add("denner3");
		a.add("denner4");
//		System.out.println(a.get(3));
		
//		for(int j=0; j< a.size(); j++ ) 
//			{
//				System.out.println(a.get(j));
//			}
		for(String val :a ) 
			{
				System.out.println(val);
			}
		
		// item is present in ArrayList 
		System.out.println(a);
		System.out.println(a.contains("denner")); 
		
		String[] name = {"denner", "ricardoo", "Soares", "Ferreira"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("denner234"));

	}
}
