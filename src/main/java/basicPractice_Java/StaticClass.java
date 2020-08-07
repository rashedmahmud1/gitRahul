package basicPractice_Java;

public class StaticClass {
	private String first;
	private String last;
	private static int members =0;
	
	public StaticClass(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.format("Contructor for %s %s, numbers in the club: %d\n", first,last,members);
		}
	
	public static void main(String[] args) {
		StaticClass obj = new StaticClass("megan","fox");
		StaticClass obj2 = new StaticClass("rashed","mahmud");
		StaticClass obj3 = new StaticClass("sohel","rana");
		
		
		
		
		
	
	}

}
