package basic_Java;

public class ChildSuperClass extends ParentSuperClass {
	
	//WE HAVE TO USE SUPER KEY WORD WHEN WE HAVE A COLLUSION BETWEEN 2 CLASSES ON VERIABLE,METHOD,CONSTRUCTOR.
	
	
	ChildSuperClass(){
		super();// When we use the parent constructor then the first line have the the parent not child..
		System.out.println("i am the child constructor");
	}
	
	String name="my name is :sohel";
	public void getName() {
		System.out.println(super.name);
		System.out.println(name);
		
	}
	
	public void getData() {
		
		System.out.println("i am child data");
		super.getData();
		
	}

	public static void main(String[] args) {
		ChildSuperClass obj = new ChildSuperClass();
		//obj.getName();
		//obj.getData();
		

	}

}
