package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		System.out.println("===== Multiple of Two =====");
		System.out.println();

		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int j=0; j< arr2.length; j++ ) {
			if (arr2[j] % 2 == 0){
				System.out.println(arr2[j]+" is multiple of 2" );
				System.out.println();
			}
			else{
				System.out.println(arr2[j]+" isn't multiple of 2");
				System.out.println();
			}
		}

//		System.out.println("==========");

		System.out.println();


		System.out.println("===== Array List =====");
		System.out.println();

		ArrayList<String> a = new ArrayList<String>();


		// create a object of the class - object.method 
		a.add("java");
		a.add("javaScript");
		a.add("ruby");
		a.add("python");

		System.out.println("Array List: " + a);

		System.out.println();
		System.out.println("Getting the position 3: " +  a.get(3));
		System.out.println();

		// For Array List you use size
		System.out.println("print of normal for: ");
		for(int j=0; j< a.size(); j++ ) {
			System.out.println(a.get(j));
		}

		System.out.println();
		System.out.println("print of for each: ");
		for(String val : a ) {
			System.out.println(val);
		}

		System.out.println();

		// item is present in ArrayList

		System.out.println("Array List: "+ a);
		System.out.println("Array List constains php: "+  a.contains("php"));
		System.out.println();

		// item is present in ArrayList

		String[] name = {"denner", "ricardoo", "Soares", "Ferreira"};
		List<String> nameArrayList = Arrays.asList(name);

		System.out.println(nameArrayList);
		System.out.println("Array List constains denner: "+nameArrayList.contains("denner"));
		System.out.println();

	}
}
