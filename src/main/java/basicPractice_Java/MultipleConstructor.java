package basicPractice_Java;

public class MultipleConstructor {
	private int houre;
	private int minute;
	private int secound;
	
	public MultipleConstructor() {
		this(0,0,0);
	}
	
	public MultipleConstructor(int h) {
		this(h,0,0);
	}
	
	public MultipleConstructor(int h,int m) {
		this(h,m,0);
	}
	
	public MultipleConstructor(int h,int m,int s) {
		 setTime(h,m,s);
	}
	
	public void setTime(int h,int m,int s) {
		setHoure(h);
		setMinute(m);
		setSecound(s);
	}
	
	public void setHoure(int h) {
		houre=((h>=0&&h<24)?h:0);
	}
	
	public void setMinute(int m) {
		minute=((m>=0&&m<60)?m:0);
	}
	
	public void setSecound(int s) {
		secound=((s>=0&&s<60)?s:0);
	}
	
	public int getHour() {
		return houre;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getScound() {
		return secound;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getScound());
	}
	
	
	public static void main(String[] args) {
		MultipleConstructor obj = new MultipleConstructor();
		MultipleConstructor obj2 = new MultipleConstructor(5);
		MultipleConstructor obj3 = new MultipleConstructor(5,13);
		MultipleConstructor obj4 = new MultipleConstructor(5,13,53);
		
		System.out.printf("%s\n",obj.toMilitary());
		System.out.printf("%s\n",obj2.toMilitary());
		System.out.printf("%s\n",obj3.toMilitary());
		System.out.printf("%s\n",obj4.toMilitary());
		
		
	}

}
