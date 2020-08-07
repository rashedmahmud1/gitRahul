package basic_Java;

public class StringDemo {

	public static void main(String[] args) {
		String a ="hello";//String Literal--Mutable(create memory one time only) 
		String b="hello";
		String c = a.concat("world");
		System.out.println(c);
		System.out.println(a);//This String is Mutable 
		String s = new String("hello");//String class create every time in memory
		String ss = new String("hello");//This create new memory 
		
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		System.out.println(s.equals(ss));//true: Equels operator check for the content only
		System.out.println(s==ss);//false : == operator check for the references 
		
		// To overcome this issue Java bring next 2 classes A) StsringBuffer, B)StringBuilder.
		// StringBuffer is Threadsafe and Syncronize.* it is slower then StringBuilder.
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.append("world")); //Using append method
		
		System.out.println(sb.insert(2,"She")); //Using insert method (heShelloworld)
		System.out.println(sb.replace(5, 7, "aa")); //Using replace method (heSheaaoworld)
		System.out.println(sb.deleteCharAt(12)); // Using deleteCharAt method (heSheaaoworl)
		System.out.println(sb.reverse()); // Using reverse method(lrowoaaehSeh)
		
		//StringBuilder is not Threedsafe or Syncronize(it allow all the test run perallal at a time.* it is faster then String Buffer. 
		
		
		

	}

}
