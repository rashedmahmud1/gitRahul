package basicPractice_Java;

public class FinalClass {
	
	private int sum;
	private final int NUMBERS;
	
	public FinalClass(int x) {
		NUMBERS = x;
	}
	
	public void add() {
		sum+=NUMBERS;
	}
	
	public String toString() {
		return String.format("sum = %d\n",sum);
	}

	public static void main(String[] args) {
		FinalClass obj = new FinalClass(20);
		for(int i =0;i<6;i++) {
			obj.add();
			System.out.printf("%s",obj);
		}
		
	}

}
