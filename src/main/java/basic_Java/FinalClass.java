package basic_Java;

public class FinalClass {
	
	private int sum;
	private final int NUMBER;
	
	public FinalClass(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d\n",sum);
	}

	public static void main(String[] args) {
		FinalClass obj = new FinalClass(10);
		for(int i =0;i<5;i++) {
			obj.add();
			System.out.printf("%s",obj);
		}
		

	}

}
