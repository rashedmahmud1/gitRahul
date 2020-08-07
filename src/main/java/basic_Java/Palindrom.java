package basic_Java;

public class Palindrom {

	public static void main(String[] args) {
		String s = "mum";
		String t ="";
		
		for(int i =s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
			
		}
		System.out.println(t);
		
		
		  if(t==s)
		  { System.out.println("This is Palindrom");
		  
		  }
		  else 
		  { System.out.println("This is not palindrom"); }
		 
	}

}
