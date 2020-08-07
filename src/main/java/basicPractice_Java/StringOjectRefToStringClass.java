package basicPractice_Java;

public class StringOjectRefToStringClass {
	
	private String myName;
	private  ToStrinngClass birthday;
	
	public StringOjectRefToStringClass(String n,ToStrinngClass theDate) {
		myName = n;
		birthday = theDate;
		}
	public String toString() {
		return String.format("My name is %s, My birthday is %s",myName,birthday);
	}
	
	public static void main(String[] args) {
		ToStrinngClass ToStrinngClassobj = new ToStrinngClass(4,5,6);
		StringOjectRefToStringClass obj = new StringOjectRefToStringClass("Rashed",ToStrinngClassobj);
		System.out.println(obj);
		
		}

}
