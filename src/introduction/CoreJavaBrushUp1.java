package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		
//		int myNum= 5 ;
//		String website = "Orange HRM";
//		char letter = 'r'; 
//		double dec = 5.99;
//		boolean myCard = true;
//		
//		System.out.println(myNum+" is the value. stored in the myNum variable");
//		System.out.println(website+" is the value. stored in the myNum variable");
//		System.out.println(letter+" is the value. stored in the myNum variable");
//		System.out.println(dec+" is the value. stored in the myNum variable");
//		System.out.println(myCard+" is the value. stored in the myNum variable");
		
		// Arrays 
		int[] arr = new int[5];
		arr[0] = 1 ;
		arr[1] = 2 ;
		arr[2] = 4 ;
		arr[3] = 5 ;
		arr[4] = 6 ;
		
//		System.out.println(arr[0]); // printa o primeiro 
//		System.out.println(arr[4]);// printa o ultimo 
//		System.out.println(myCard+" is the value. stored in the myNum variable")
	
		int[] arr2 = {1,2,4,5,6,45,546,51513,1516512};
//		System.out.println(arr2[0]); // printa o primeiro 
//		System.out.println(arr2[4]); // printa o ultimo 
		
		//for loop
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
//		for(int i = 0; i < arr2.length; i++)
//		{
//			System.out.println(arr2[i]);
//		}
		
		String[] name = {"denner", "ricardoo", "Soares", "Ferreira"};
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
	}

}
