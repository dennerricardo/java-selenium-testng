package introduction;

public class CoreJavaBrushUp3 {
	
	public static void main(String[] args) {
	
		//string is an object that represents sequence of caracteres
		// String Literal

		// Both values are same than one object is created in the memory space
		String s0 = "Denner ricardo";
		String s1 = "Denner ricardo";

		//New object will be created in the memory space because this value is not present
		String s2 = "Denner ricardo1";
		
		// New keyword
		// Everytime you create like this you are creating a new object in the memory space
		
		String s3 = new String("welcome");		
		String s4 = new String("welcome");

		// ================================================================= //

		String s = "Denner Ricardo Soares";

		// splittedString which holds three values
		// because we split that s with a white space (" ")
		// you also can cut like s.split("Ricardo");
		// and than you will have now two values split
		// System.out.println(splittedString[0].trim());
		// System.out.println(splittedString[1].trim());
		// Console: Denner
		// Console: Soares

		String[] splittedString = s.split("Ricardo");
		// trim took of the space on the print " Soares"
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
//		System.out.println(splittedString[2].trim());

		System.out.println();
		System.out.println("=======  string normal order    =========");
		System.out.println();

		// printing string normal order
		// Starting from fist position int i=0
		// i increase while  i<s.length()
		// i value increase with i++ on each iteration

		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println();
		System.out.println("=======  string reverse order    =========");
		System.out.println();

		// printing string reverse order
		// Starting from last position int i=s.length()-1
		// i goes until 0 with i>=0
		// i value decreases with i-- on each iteration
		for(int i=s.length()-1; i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
	
}
