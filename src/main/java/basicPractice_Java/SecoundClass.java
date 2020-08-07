package basicPractice_Java;

public class SecoundClass {
	private String BfName;
	public SecoundClass(String name) {
		BfName=name;
	}
	
	/*
	 * public void setName(String name) { BfName=name; }
	 */
	public String getName() {
		return BfName;
	}
	public void saying() {
		System.out.printf("My first friend name was %s",getName() );
	}
	
	
	 public void simpleMessage()
	 { System.out.println("This is a simple message  ");
	 System.out.println("Hello "+name); 
	  
	 
	}


