package introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();

		MethodsDemo2 d1 = new MethodsDemo2();

		System.out.println(name);
		System.out.println();

		d1.getUserData();
		System.out.println();

		getData2();
		
	}
	
	public String getData() {
		System.out.println("========= 1");
		return "ooooooooooi denner";
	}

	// When you mark you object as static then this method will get belong to class level, not object
	// and you can directly call getData2() even without object
	
	public static String getData2() {
		System.out.println("========= 2");
		return "ooooooooooi denner";
	}


}
