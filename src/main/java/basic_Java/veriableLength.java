package basic_Java;

public class veriableLength {

	public static void main(String[] args) {
		System.out.println(avarage(34,45,67));
		
	}
	
	public static  int avarage(int...numbers) {
		int total =0;
		for (int x:numbers) {
			total+=x;
			
		}
		return total/numbers.length;
		
	}

}
