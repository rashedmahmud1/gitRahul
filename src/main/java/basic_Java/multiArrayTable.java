package basic_Java;

public class multiArrayTable {

	public static void main(String[] args) {
		int firstarray[][]= {{45,56,78},{90,34,2},{80,45,5}};
		int secoundarray[][]= {{2,3,4,},{45,67,8}};
		
		System.out.println("This is first array table");
		display(firstarray);
		
		System.out.println("This is my secound array table");
		display(secoundarray);
	}
	
	
	
	
	public static void display(int x [][]) {
		for(int row=0;row<x.length;row++ ) {
			for(int column=0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
	}

}
