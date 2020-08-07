package basic_Java;

public class StaticVeriablesDemo {
	
	String name;//INSTANCE VERIABLE OR LOCAL INSTANCE VERIABLE CAUSE IT IS IN THAT CLASS
	String address;
	static int i =0;
	static String City="Dhaka";//INITIALIZING THE STATIC VERIABLE(ALL STATIC VERIABLES ARE CALLED CLASS VERIABLE)
	//WHEN YOU DECLEAR ANY STATIC VERIABLE OR METHOD IT NOT IN OBJECT LEVEL BUT ITS ON CLASS LEVEL.
	
	static {
		// THIS IS STATIC BLOCK AND WE COULD INITILIZE ALL OUR STATIC VERIAVLES INSIIDE THIAS BLOCK FOR OPTIMIZE OUR CODE.
	}
	
	StaticVeriablesDemo(String name, String address){// INSIDE THE CONSTRUCTOR CALLED LOCAL VERIABLE
		this. name=name;
		this.address=address;
		i++;
		System.out.println(i);//INSTANCE VERIABLE DO NOT CREATE FRESS MEMORY IN HIP MEMORY ITS REPLACE THE MEMORY EACH TIME WE RUN.
		
		
	}
	public void getName() {
		System.out.println(name+" "+ City);
		
	}
	
	public  static void getCity() {//STATIC METHOD TAKE ONLY STATIC VERIABLES AND TO CALL THE METHOD YOU NEED TO CALL BY CLASS NAME.
		System.out.println(City);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		StaticVeriablesDemo obj = new StaticVeriablesDemo("Bob","mirmur");
		StaticVeriablesDemo obj1 = new StaticVeriablesDemo("John","Monipur");
		obj.getName();
		obj1.getName();
		StaticVeriablesDemo.getCity();
		
		

	}

}
