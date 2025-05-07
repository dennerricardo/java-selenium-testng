package introduction;

import java.util.Arrays;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		System.out.println("===== Types =====");
		System.out.println();

		int myNum= 5 ;
		String website = "Orange HRM";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;

		System.out.println(myNum+" myNum holds an integer value");
		System.out.println(website+" website holds a String value");
		System.out.println(letter+" letter holds a character value");
		System.out.println(dec+" dec holds a double value");
		System.out.println(myCard+" myCard holds a boolean value.");

		System.out.println();

		// Arrays
		System.out.println("===== Arrays =====");
		System.out.println();
		int[] arr = new int[5];
		arr[0] = 1 ;
		arr[1] = 2 ;
		arr[2] = 4 ;
		arr[3] = 5 ;
		arr[4] = 6 ;

		System.out.println("Stored in arr : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("position 0: " + arr[0]);
		System.out.println("position 3: " + arr[3]);

		System.out.println();

		int[] arr2 = {1456,2343,4553,5546,654,454,546,51513,1516512};

		System.out.println("Stored in arr2 " + Arrays.toString(arr2));
		System.out.println();
		System.out.println("position 5: " +arr2[5]);
		System.out.println("position 8: " +arr2[8]);
		System.out.println("position 0: " +arr2[0]);

		System.out.println();

		//for loop

		System.out.println("===== for loop =====");
		System.out.println();
		System.out.println("Loop of arr : " + Arrays.toString(arr));
		System.out.println();

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("Loop of arr2 " + Arrays.toString(arr2));
		System.out.println();

		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();

		String[] name = {"Denner", "Ricardo", "Soares", "Ferreira"};

		System.out.println("Loop of Strings in name variable " + Arrays.toString(name));
		System.out.println();

		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
	}

}
