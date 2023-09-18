package introduction;

public class CoreJavaBrushUp3 {
	
	public static void main(String[] args) {
	
		//string is an object // String Literal
		
		String s0 = "Denner ricardo";
		String s1 = "Denner ricardo1";
		String s2 = "Denner ricardo2";
		
		//new 
		
		String s3 = new String("welcome");		
		String s4 = new String("welcome");	
		
		String s = "Denner Ricardo Soares";
		String[] splittedString = s.split("Ricardo");
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
//		System.out.println(splittedString[2].trim());
		
		for(int i=s.length()-1; i>=0;i--) 
		{
			System.out.println(s.charAt(i));
		}
		
//		for(int i=0; i<s.length();i++) 
//		{
//			System.out.println(s.charAt(i));
//		}
	}
	
}
