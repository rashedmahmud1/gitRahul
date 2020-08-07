package basic_Java;

public class ThisKeywordDemo {
	//THIS KEYWORD REFER TO THE CURRENT CLASS AND OBJECT SCOOP LIES IN THE CLASS LAVEL.
	//SUPER KEYWORD REFER TO THE PARENT CLASS TO CHILD CLASS 
	
	
	
	int a =3;
	
	public void getData() {
		int a=4;
		int b=this.a+a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		ThisKeywordDemo obj = new ThisKeywordDemo();
		obj.getData();
		

	}

}
