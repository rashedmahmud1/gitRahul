package basic_Java;

public class multipleConstructor {
	private int hour;
	private int minute;
	private int secound;
	
	public  multipleConstructor() {
		this(0,0,0);
	}
	public  multipleConstructor(int h) {
		this(h,0,0);
	}
	public  multipleConstructor(int h,int m) {
		this(h,m,0);
	}
	public  multipleConstructor(int h,int m, int s) {
		 setTime(h,m,s);
	}
	
	public void setTime(int h,int m, int s) {
		setHour(h);
		setMinute(m);
		setSecound(s);
		
	}
	public void setHour(int h) {
		hour=((h>=0 && h<24)? h:0);
	}
	public void setMinute(int m) {
		minute= ((m>=0 && m<60)? m:0);
		}
	public void setSecound(int s) {
		secound = ((s>=0 && s<60)? s:0);
	}
	
	public int getHour() {
		return hour;
	}
	public int getminute() {
		return minute;
	}
	public int getSecound() {
		return secound;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d",getHour(),getminute(),getSecound());
		
	}



	




	



}