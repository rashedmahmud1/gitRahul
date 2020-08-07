package basicPractice_Java;

public class ToStrinngClass {
	private int Month;
	private int Day;
	private int Year;
	
	public ToStrinngClass(int m,int d,int y) {
		Month = m;
		Day = d;
		Year = y;
		
		System.out.printf("The Contractor for this is %s\n",this);
	}
	public String toString() {
		return String.format("%d/%d/%d",Month,Day,Year);
	}

	

}
