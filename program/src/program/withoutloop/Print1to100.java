package program.withoutloop;

public class Print1to100 {
	
	public void printNumber(int num) {
		if(num <= 100) {
			System.out.println(num+"");
			printNumber(num+"");
		}
	}
}
