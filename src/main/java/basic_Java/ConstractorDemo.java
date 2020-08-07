package basic_Java;

public class ConstractorDemo {
	//IF WE DO NOT CREATE A CONSTRACTOE THEN JAVA COMPILER CREATE IMPLICITE CONSTRUCTOR BY DEFAULT.
	// AND IF WE CREATE CONSTRACTOR THEN JAVA COMPILER TAKE THE EXPLICIT COSTRUCTOR.
	// THERE IS 2 KIND OF CONSTRUCTOR A)NON-PERAMITARIZE B)PERAMITARIZE
	//CONSTRUTOR DO NOT RETURN ANY VALUE(NO VOID)
	//IT IS SAME AS CLASS NAME
	
	
	public ConstractorDemo() {
		System.out.println("I am the constractor");
	}
	
	public ConstractorDemo(String st) {
		System.out.println(st);
	}
	public ConstractorDemo(int a, int b) {
		int c= a+b;
		System.out.println(c);
		System.out.println("I am the Peramitarize constractor with int");
	}
	
	
	
	
	public void getData() {
		System.out.println("I am the method");
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		ConstractorDemo cd = new ConstractorDemo();
		ConstractorDemo c = new ConstractorDemo("hello");
		ConstractorDemo c1 = new ConstractorDemo(2,3);
		

	}

}
