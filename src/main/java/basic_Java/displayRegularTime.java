package basic_Java;

public class displayRegularTime {
	int hour;
	int minute;
	int secound;
	
	public void setTime(int h,int m, int s) {
		hour=((h>=0 && h<24) ?h : 0);
		minute= ((m>=0 && m<60) ? m :0);
		secound = ((s>=0 && s<60) ? s : 0);
		
		}
	public String toMilitarry() {
		return String.format("%02d:%02d:%02d",hour,minute,secound);
	}
	
	public String toRegTime() {
		return String.format("%d : %02d : %02d: %s",((hour==0 || hour==12)? 12 : hour%12), minute, secound, (hour<12? "AM":"PM"));
	}

}
